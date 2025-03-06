package Observer.StockChange;

public class Main {
    public static void main(String[] args) {
        Investor investor1 = new Investor("Investor 1");
        Investor investor2 = new Investor("Investor 2");
        Investor investor3 = new Investor("Investor 3");

        Stock stock = new Stock("FLC", 1000);

        stock.add(investor1);
        stock.add(investor2);
        stock.add(investor3);

        stock.setStockPrice(2000);
    }
}
