package tests;

import models.Coin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class CoinTest  {

    private Coin coin;
    private final int MIN_COIN_CHANGE = 8;
    public final int MIN_TEST_COIN_FLIPS = 20;

    @Before
    public void setup(){
        coin = new Coin();
    }
    @Test
    public void testCoinFlip(){
        int coinState = coin.checkStatus();
        coin.flip();
        assertNotEquals(coin.checkStatus(), coinState);
    }

    @Test
    public void testCoinFlipDoesNotReturnSameResult(){
        boolean isChanged = false;
        int coinState = coin.checkStatus();
        for (int i = 0; i < MIN_TEST_COIN_FLIPS; i++){
            coin.flip();
            if(coin.checkStatus() != coinState)
                isChanged = true;
        }

        assertTrue(isChanged);
    }


    @Test
    public void testCoinFlipChangesMoreThanFiveTimes(){
        int changeCount = 0;
        int coinState = coin.checkStatus();
        for (int i = 0; i < MIN_TEST_COIN_FLIPS; i++){
            coin.flip();
            if(coinState != coin.checkStatus())
                changeCount++;
        }

        assertTrue(changeCount > MIN_COIN_CHANGE);

    }


}
