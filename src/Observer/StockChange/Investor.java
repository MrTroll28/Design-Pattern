package Observer.StockChange;

public class Investor implements Observer{
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void changeValue(String stockName, int newValue) {
        System.out.println("Investor " + name +
                " has been notified that the value of " + stockName +
                " change with new value: " + newValue);
    }
}
