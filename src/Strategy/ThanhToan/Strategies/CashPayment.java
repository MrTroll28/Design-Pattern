package Strategy.ThanhToan.Strategies;

public class CashPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("💵 Thanh toán " + amount + " bằng tiền mặt.");
    }
}
