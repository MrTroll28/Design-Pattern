package Strategy.ThanhToan;


import Strategy.ThanhToan.Strategies.BankTransferPayment;
import Strategy.ThanhToan.Strategies.CashPayment;
import Strategy.ThanhToan.Strategies.MomoPayment;
import Strategy.ThanhToan.Strategies.VNPayPayment;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(500000);
        order1.setPaymentStrategy(new CashPayment());
        order1.pay();

        System.out.println("------------------");

        Order order2 = new Order(1000000);
        order2.setPaymentStrategy(new MomoPayment());
        order2.pay();

        System.out.println("------------------");

        Order order3 = new Order(2000000);
        order3.setPaymentStrategy(new VNPayPayment());
        order3.pay();

        System.out.println("------------------");
        Order order4 = new Order(3000000);
        order4.setPaymentStrategy(new BankTransferPayment());
        order4.pay();
    }
}

