package Strategy.ThanhToan;

import Strategy.ThanhToan.Strategies.PaymentStrategy;

public class Order {
    private PaymentStrategy paymentStrategy;
    private double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay() {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
            System.out.println("✅ Đơn hàng đã thanh toán thành công!");
        } else {
            System.out.println("⚠️ Vui lòng chọn phương thức thanh toán.");
        }
    }
}

