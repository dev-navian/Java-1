package objects;

public class Trade {
    String id;
    String symbol;
    int quantity;
    double price;

    Trade (String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    Trade (String id, String symbol, int quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public String toString() {
        System.out.println("Trade: ID: " + id + " Symbol: " + symbol + " Quantity: " + quantity + " Price: " + price);
        return null;
    }

    public void setPrice(double price) {

        if (price < 0) {
            System.out.println("Prices can only be positive numbers. Please try again");
        } else {
            this.price = price;
        }

    }
}
