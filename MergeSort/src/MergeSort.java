import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort<T> {

    public static <T extends Comparable<T>> void sort(T[] items){
        if(items.length < 2)
            return;

        //split array into two halves
        int size = items.length;
        int mid = size / 2;

        T[] firstHalf = (T[]) new Object[mid];

        for (int i = 0; i < mid; i += 1){
            firstHalf[i] = items[i];
        }

        T[] secondHalf = (T[]) new Object[size - mid];
        for (int i = 0; i < size - mid; i+=1){
            secondHalf[i] = items[++mid];
        }

        //recursively sort both halves of arrays
        sort(firstHalf);
        sort(secondHalf);

        merge(firstHalf, secondHalf, items);

        //merge two sorted sub-lists into one
    }

    public static <T> T[] split( Object[] items, int startIdx, int endIdx){

        //won't work due to type erasure. source: https://stackoverflow.com/questions/34939499/how-to-properly-return-generic-array-in-java-generic-method
        //T[] returnValue = (T[]) new Object[endIdx];

        T[] returnValue = (T[]) new Object[endIdx - startIdx];

        int start = startIdx;
        int count = 0;

        while (start < endIdx){
            returnValue[count] = (T) items[start];
            start += 1;
            count += 1;
        }

        Arrays.sort(returnValue);
        return returnValue;
    }

    public static <T extends Comparable<T>> void merge(T[] firstHalf, T[] secondHalf, T[] dest){
        int i = 0;
        int j = 0;
        for (int k = 0; k < dest.length; k+=1){

            if(i == firstHalf.length)
                dest[k] = secondHalf[i];
            else if(j == secondHalf.length)
                dest[k] = firstHalf[i];
            else{
                if(firstHalf[i].compareTo(secondHalf[j]) <= 0){
                    dest[k] = firstHalf[i];
                    i += 1;
                } else {
                    dest[k] = secondHalf[j];
                    j += 1;
                }
            }

        }
    }

    public static void main(String[] args) {
        String[] strings = {"pineapple", "banana", "watermelon", "apple", "strawberry"};

        String[] firstHalf = split( strings, 0,strings.length/2);
        String[] secondHalf = split( strings, strings.length/2, strings.length);
    }
}
