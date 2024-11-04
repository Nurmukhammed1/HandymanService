package Payment;

public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(int amount) {
        paymentStrategy.collectPaymentDetails();
        paymentStrategy.validatePaymentDetails();
        paymentStrategy.pay(amount);
    }
}
