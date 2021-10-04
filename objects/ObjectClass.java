package objects;

public class ObjectClass {

    public static void main(String[] args) {
        Trade tradeOne = new Trade("T1", "APPL", 100, 15.25);
        Trade tradeTwo = new Trade("T1", "OOP1", 100);

        Account accountOne = new Account();

        tradeOne.toString();
        tradeTwo.toString();
        tradeTwo.setPrice(43.23);
        tradeTwo.toString();

        // printing the number of Trades (instances of the Trade class)
        System.out.println(Trade.numOfObjects);
        System.out.println(accountOne.getNumOfObjects());

        // setting the number of Trades
        accountOne.setNumOfObjects(3);

        // printing the number of Trades after setting it
        System.out.println(accountOne.getNumOfObjects());


    }
}

