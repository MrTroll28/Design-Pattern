package State.ThanhToan.States;

import State.ThanhToan.Order;

public class VNPayPayment implements PaymentState {
    public void pay(Order order) {
        System.out.println("💳 Thanh toán qua VN Pay.");
        order.setPaid(true);
    }
}
