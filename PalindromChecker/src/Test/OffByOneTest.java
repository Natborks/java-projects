package Test;

import model.OffByOne;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OffByOneTest {
    OffByOne offByOne;

    @Before
    public void setUp(){
        offByOne = new OffByOne();
    }

    @Test
    public void testEqualChars(){
        boolean result = offByOne.equalChars('x', 'y');
        Assert.assertTrue(result);

        boolean result1 = offByOne.equalChars('a', 'z');
        Assert.assertFalse(result1);

        boolean result2 = offByOne.equalChars('a', 'e');
        Assert.assertFalse(result2);
    }

}
