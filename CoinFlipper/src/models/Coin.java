package models;

import java.util.Random;

public class Coin {
    //state of the coin; 0 for tails 1 for heads
    private int coinState;

    public Coin() {
        coinState = 0;
    }

    //MODIFIES: this
    //EFFECT: change the state of the coin to heads or tails at random
    public void flip () {
        Random ran = new Random();
        boolean b = ran.nextBoolean();
        coinState =  b ? 1 : 0;
    }

    //EFFECT: produce the state of the coin
    public int checkStatus() {return  coinState;}
}
