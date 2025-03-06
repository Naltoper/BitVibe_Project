package java_project;

public class BitcoinPrice {
    private Double bitcoinPrice;

    // Constructor
    public BitcoinPrice() {
        this.bitcoinPrice = fetchBitcoinPrice();
    }

    // Method to fetch Bitcoin price from CoinGecko API
    private Double fetchBitcoinPrice() {
        Double price = 90_000.0; //TODO fetch from api
        return price;
    }


    // Method to refresh the price
    public void refreshPrice() {
        this.bitcoinPrice = fetchBitcoinPrice();
    }


    // Public method to get the current price
    public Double getCurrentPrice() {
        refreshPrice();
        return this.bitcoinPrice;
    }
}
