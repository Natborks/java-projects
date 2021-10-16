package models;

public class IntList {

    public int first;
    public IntList rest;

    public IntList(int first, IntList rest){
        this.first = first;
        this.rest = rest;
    }

    public String printFirst(){
        return String.valueOf(this.first);
    }

    public int getFirst() {
        return first;
    }

    public void printIntList(){
        if (this.rest == null){
            return ;
        }
        System.out.println(first);
        this.rest.printIntList();
    }

    public int sumList(){
        if (rest == null){
            return first;
        }

        //rest
        return first + this.rest.sumList();
    }

    public int sizeList(){
        if (null == rest){
            return 1;
        }

        return 1 + this.rest.sizeList();
    }
}
