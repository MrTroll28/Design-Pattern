package State.ThanhToan.States;

import State.ThanhToan.Order;

public class CashPayment implements PaymentState {
    public void pay(Order order) {
        System.out.println("💵 Thanh toán bằng tiền mặt.");
        order.setPaid(true);
    }
}
