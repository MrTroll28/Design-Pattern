package Strategy.ThanhToan.Strategies;

public class BankTransferPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("🏦 Chuyển khoản ngân hàng số tiền: " + amount);
    }
}
