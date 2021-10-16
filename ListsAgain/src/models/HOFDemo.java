package models;

public class HOFDemo {
    public static int doTwice(IntUnaryFunction f, int x){
        return f.apply(f.apply(x));
    }

    public static void main(String[] args) {
        IntUnaryFunction tenx = new Tenx();

        System.out.println(doTwice(tenx, 2));
    }
}
