import models.Coin;

public class CoinUsage {
    public static void main(String[] args) {
        Coin coin = new Coin();

        System.out.println(coin.checkStatus());
        coin.flip();
        System.out.println(coin.checkStatus());
        coin.flip();
        System.out.println(coin.checkStatus());
    }
}
