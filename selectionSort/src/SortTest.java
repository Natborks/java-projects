import org.junit.Assert;
import org.junit.Test;

public class SortTest {

    @Test
    public void testSwap(){
        String[] input = {"i", "have", "an", "egg"};
        Sort.swap(input, 0, 2);
        String[] expected = {"an", "have", "i", "egg"};

        org.junit.Assert.assertArrayEquals(input, expected);
    }

    @Test
    public void testFindSmallest(){
        String[] input = {"i", "have", "an", "egg"};
        int result = Sort.findSmallest(input, 0);

        org.junit.Assert.assertEquals(2, result);

        String[] input2 = {"i", "have", "no", "eggs"};
        int result2 = Sort.findSmallest(input2, 0);

        org.junit.Assert.assertEquals(3, result2);

        String[] input3 = {"i", "have", "no", "zebras"};
        int result3 = Sort.findSmallest(input3, 2);

        org.junit.Assert.assertEquals(2, result3);

    }

    @Test
    public void testSort(){
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};

        Sort.sort(input);
        org.junit.Assert.assertArrayEquals(input, expected);
    }
}
