package Payment;

public interface PaymentStrategy {
    void collectPaymentDetails();

    boolean validatePaymentDetails();

    void pay(int amount);
}
