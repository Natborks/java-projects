package main;

import model.CharacterComparator;
import model.Deque;

import java.util.ArrayDeque;

public class Palindrome {
    public static void main(String[] args) {
        Deque<Character> deque = new Deque<>();

        deque.addLast('k');
        deque.addLast('a');
        deque.addLast('y');
        deque.addLast('a');
        deque.addLast('k');

        int a = 'a';
        int b = 'b';
        System.out.println(a);
        System.out.println(b);
    }

    public static Deque<Character> convertStringToDeque(String s){

        Deque<Character> deque = new Deque<>();

        for(int i = 0; i < s.length(); i++){

            /** convert all characters to lowercase**/
            char character = Character.toLowerCase(s.charAt(i));

            /** if the character is a letter or digit number, then we insert it to the deque **/
            if(Character.isLetterOrDigit(character)){

                deque.addLast(character);
            }
        }

        return deque;
    }

    public static boolean isPalindrome(Deque<Character> deque){
        return  isPalindrome(deque.removeFirst(), deque.removeLast(), deque);
    }

    private static boolean isPalindrome(Character first,
                                        Character last,
                                        Deque<Character> deque) {
        if(deque.size() == 1 || deque.size() == 0)
            return true;

        if (first == last){
            return isPalindrome(deque.removeFirst(), deque.removeLast(), deque);
        } else{
            return  false;
        }
    }

    public static boolean isPalindrome(String word, CharacterComparator cc){
        if(cc.equals(null))
            return isPalindrome(convertStringToDeque(word));

        return true;
    }


}
