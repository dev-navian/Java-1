package objects;

public class Trade {
    String id;
    String symbol;
    int quantity;
    double price;

    static int numOfObjects = 0;

    // instance block for determining the total number of instantiated objects
    {
        numOfObjects += 1;
    }

    public Trade (String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public Trade (String id, String symbol, int quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public String toString() {
        System.out.println("Trade: ID: " + id + " Symbol: " + symbol + " Quantity: " + quantity + " Price: " + price);
        return null;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double definedPrice) {
        if (definedPrice < 0) {
            throw new IllegalArgumentException("Please enter a positive value");
        }

        this.price = definedPrice;
    }

    public String greeting() {
       return "Hello";
    }
}
