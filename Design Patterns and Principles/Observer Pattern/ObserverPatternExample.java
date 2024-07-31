public class ObserverPatternExample {

    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("MobileApp");
        Observer webApp = new WebApp("WebApp");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice(100.50);
        stockMarket.setStockPrice(105.75);

        stockMarket.removeObserver(webApp);
        stockMarket.setStockPrice(110.00);
    }
}
