package State.ThanhToan;

import State.ThanhToan.States.CashPayment;
import State.ThanhToan.States.MomoPayment;
import State.ThanhToan.States.VNPayPayment;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setPaymentState(new CashPayment());
        order1.pay();

        System.out.println("------------------");

        Order order2 = new Order();
        order2.setPaymentState(new MomoPayment());
        order2.pay();

        System.out.println("------------------");

        Order order3 = new Order();
        order3.setPaymentState(new VNPayPayment());
        order3.pay();
    }
}

