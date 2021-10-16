package Test;

import main.Palindrome;
import model.OffByOne;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import model.Deque;

public class PalindromeTest {
    Deque<Character> deque;
    @Before
    public void setup(){
        deque = new Deque<>();

        deque.addLast('k');
        deque.addLast('a');
        deque.addLast('y');
        deque.addLast('a');
        deque.addLast('k');
    }

    @Test
    public void testIsPalindrome(){
        boolean result = Palindrome.isPalindrome(deque);
        Assert.assertTrue(result);

        Deque<Character> deque1 = new Deque<>();
        deque1.addFirst('d');
        deque1.addFirst('b');

        result = Palindrome.isPalindrome(deque1);
        Assert.assertTrue(result);

        Deque<Character> deque2 = Palindrome.convertStringToDeque("Civil");
        result = Palindrome.isPalindrome(deque2);
        Assert.assertFalse(result);

        Deque<Character> deque3 = Palindrome.convertStringToDeque("Civic");
        result = Palindrome.isPalindrome(deque3);
        Assert.assertTrue(result);

    }

    @Test
    public void testIsPalindromeOffByOne(){
        OffByOne offByOne = new OffByOne();
        OffByOne nullOffByONe = null;

        boolean result = Palindrome.isPalindrome("flake", offByOne);
        Assert.assertTrue(result);

        boolean result1 = Palindrome.isPalindrome("Rotps", offByOne);
        Assert.assertTrue(result1);

        boolean result2 = Palindrome.isPalindrome("cake", offByOne);
        Assert.assertFalse(result2);

        boolean result3 = Palindrome.isPalindrome("Rotor", nullOffByONe);
        Assert.assertTrue(result3);
    }
}
