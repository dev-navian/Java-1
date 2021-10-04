package objects;

public class Objects {

    public static void main(String[] args) {
        Trade tradeOne = new Trade("T1", "APPL", 100, 15.25);
        Trade tradeTwo = new Trade("T1", "APPL", 100);

        tradeOne.toString();
        tradeTwo.toString();
        tradeTwo.setPrice(43.23);
        tradeTwo.toString();

    }
}

