package Observer.StockChange;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String stockName;
    private int stockPrice;
    private List<Investor> investors;

    public Stock(String stockName, int stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.investors = new ArrayList<>();
    }

    // Đăng ký nhà đầu tư
    public void add(Investor investor) {
        investors.add(investor);
    }

    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
        notifyInvestors();
    }

    public void notifyInvestors() {
        for (Investor investor : investors) {
            investor.changeValue(stockName, stockPrice);
        }
    }
}
