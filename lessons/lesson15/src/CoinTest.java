import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class CoinTest {

    @Test
    public void validCoin() throws Exception {
        Coin coin = new Coin(10, 0);
    }
}