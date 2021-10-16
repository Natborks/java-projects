package tests;

import ui.Sort;

import java.util.Arrays;
import org.junit.Before;



public class TestSort {

    //test ui.Sort.sort Method
    public static void testSort(){
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);


        org.junit.Assert.assertArrayEquals(input, expected);

    }

    public static void testFindSmallest(){
        String[] input = {"i", "have", "an", "egg"};
        int result = Sort.findSmallest(input, 0);
        int expected = 2;

        org.junit.Assert.assertEquals(expected, result);

        String[] input2 = {"there", "are", "many", "pigs"};
        int expected2 = 1;

        int actual2 = Sort.findSmallest(input2, 0);
        org.junit.Assert.assertEquals(expected2, actual2);
    }

    public static void swap(){
        String[] input = {"i", "have", "an", "egg"};
        int a = 0;
        int b = 2;
        String[] expected = {"an", "have", "i", "egg"};

        Sort.swap(input, a, b);

        org.junit.Assert.assertArrayEquals(input, expected);
    }

    public static void main(String[] args) {
        testSort();
        //testFindSmallest();
        //swap();
    }
}
