package Strategy.ThanhToan.Strategies;

public class MomoPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("📱 Thanh toán " + amount + " qua Momo.");
    }
}
