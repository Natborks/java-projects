public class Sort {

    public static void sort(String[] input){
        sort(input, 0);
    }

    public static void swap(String[] input, int i, int j){
        String temp = input[i];
        input[i] = input[j];
        input[j] = temp;

    }

    public static int findSmallest(String[] input, int start){
        int smallest = start;
        for (int i = start; i < input.length; i++){
            int comp = input[i].compareTo(input[smallest]);

            if(comp < 1)
                smallest = i;
        }
        return smallest;
    }

    private static void sort(String[] input, int start){
        if(start == input.length)
            return;
        int smallestIndex = findSmallest(input, start);
        swap(input, start, smallestIndex);
        start += 1;
        sort(input, start);
    }

}
