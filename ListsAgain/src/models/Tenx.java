package models;

/*
Represents a function that takes in an integer and returns another integer
 */
public class Tenx implements IntUnaryFunction {

    /*
    * returns 10 times its argument
    */
    @Override
    public int apply(int x) {
        return 10 * x;
    }
}
