package State.ThanhToan.States;

import State.ThanhToan.Order;

public class MomoPayment implements PaymentState {
    public void pay(Order order) {
        System.out.println("📱 Thanh toán qua Momo.");
        order.setPaid(true);
    }
}
