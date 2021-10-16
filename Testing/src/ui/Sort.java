package ui;

public class Sort {

    public static void sort(String[] args) {
        sort(args, 0);
    }
    public static void main(String[] args) {

    }

    //MODIFIES: Given array
    //EFFECTS: Sorts given array starting from given position
    public static void sort(String[] x, int start){
        if(start == x.length)
            return;

        int smallestIndex = findSmallest(x, start);
        swap(x, start, smallestIndex);
        sort(x, start + 1);
    }

    //EFFECTS: Return the index of the smallest string starting at start
    public static int findSmallest(String[] x, int start){

        int smallest = start;
        for (int i = start; i < x.length; i += 1) {
            int cmp = x[i].compareTo(x[smallest]);
            if (cmp < 0) {
                smallest = i;
            }
        }
        return smallest;
    }

    //MODIFIES: Modifies given string array
    //EFFECTS: Swaps two array positions in an array
    public static void swap(String[] x, int a, int b){
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

}
