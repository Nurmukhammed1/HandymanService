package Facade;

import Payment.PaymentByCreditCard;
import Payment.PaymentByPayPal;
import Payment.PaymentService;
import Payment.PaymentStrategy;

import java.util.Scanner;

public class PaymentFacade {
    private PaymentService paymentService;
    private Scanner scanner;

    public PaymentFacade() {
        this.scanner = new Scanner(System.in);
    }

    public void processUserPayment() {
        PaymentStrategy paymentStrategy = choosePaymentMethod();

        if (paymentStrategy == null) {
            System.out.println("Invalid payment method selected. Exiting payment.");
            return;
        }

        System.out.println("Enter amount to pay:");
        int amount = scanner.nextInt();

        paymentService = new PaymentService(paymentStrategy);
        paymentService.processPayment(amount);
    }

    private PaymentStrategy choosePaymentMethod() {
        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                return new PaymentByCreditCard();
            case 2:
                return new PaymentByPayPal();
            default:
                System.out.println("Invalid choice. Please select a valid payment method.");
                return null;
        }
    }
}

