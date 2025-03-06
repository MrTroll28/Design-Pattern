package State.ThanhToan.States;

import State.ThanhToan.Order;

class BankTransferPayment implements PaymentState {
    public void pay(Order order) {
        System.out.println("🏦 Thanh toán qua chuyển khoản ngân hàng.");
        order.setPaid(true);
    }
}
