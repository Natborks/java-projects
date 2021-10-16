import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void testMergeSort(){
        String[] strings = {"pineapple", "banana", "watermelon", "apple"};
        String[] expected = {"apple", "banana", "pineapple", "watermelon"};

        MergeSort.sort(strings);

        Assert.assertArrayEquals(expected, strings);
    }

    @Test
    public void testSplit(){
        String[] strings = {"pineapple", "banana", "watermelon", "apple"};
        String[] expectedFirstHalf = {"pineapple", "banana"};
        String[] expectedSecondHalf = {"watermelon", "apple"};

        int half = strings.length / 2;

        String[] firstHalf =  MergeSort.split(strings, 0, half);
        String[] secondHalf =  MergeSort.split(strings, half, strings.length );

        Assert.assertArrayEquals(expectedFirstHalf, firstHalf);
        Assert.assertArrayEquals(expectedSecondHalf, secondHalf);
    }

    @Test
    public void testMerge(){
        String[] strings = {"pineapple", "banana", "watermelon", "apple"};
        String[] secondHalf = {"banana", "pineapple"};
        String[] firstHalf = { "apple", "watermelon"};
        String[] expected = {"apple", "banana", "pineapple", "watermelon"};

        MergeSort.merge(firstHalf, secondHalf, strings);

        Assert.assertArrayEquals(expected, strings);
    }
}
