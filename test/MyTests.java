package test;
import objects.Trade;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {
    Trade newTrade = new Trade("ACDSS", "0021AD", 34, 55.0);

    @Test
    public void passAssertionWhenPositive() {
        double price = 55.0;
        newTrade.setPrice(price);
        Assertions.assertEquals(newTrade.getPrice(), price);
    }

    @Test
    public void failAssertionWhenNegative() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            newTrade.setPrice(-55.0);
        });

        String expectedMessage = "Please enter a positive value";
        String actualMessage = exception.getMessage();

        Assertions.assertEquals(expectedMessage, actualMessage);
    }




}
