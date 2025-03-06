package Strategy.ThanhToan.Strategies;

public class VNPayPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("💳 Thanh toán " + amount + " qua VN Pay.");
    }
}
