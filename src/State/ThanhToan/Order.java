package State.ThanhToan;

import State.ThanhToan.States.PaymentState;

public class Order {
    private PaymentState paymentState;
    private boolean isPaid = false;

    public void setPaymentState(PaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public void pay() {
        if (paymentState != null) {
            paymentState.pay(this);
        } else {
            System.out.println("⚠️ Vui lòng chọn phương thức thanh toán.");
        }
    }

    public void setPaid(boolean paid) {
        this.isPaid = paid;
        if (paid) {
            System.out.println("✅ Đơn hàng đã được thanh toán.");
        }
    }

    public boolean isPaid() {
        return isPaid;
    }
}

