package objects;

public class Account {

    // getting the number of Trades (total number of instances of the Trade class)
    public int getNumOfObjects() {
        return Trade.numOfObjects;
    }

    // setting the total number of Trades
    public void setNumOfObjects(int value) {
        Trade.numOfObjects = value;
    }
}
