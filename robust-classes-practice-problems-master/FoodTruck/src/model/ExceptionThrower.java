package model;

import model.quizExceptions.IQuitException;
import model.quizExceptions.RecoverableException;

public class ExceptionThrower {
    public static void main(String[] args) {
        String string = "23";
        Quiz.A a = new Quiz.A();
        try {
            a.doA(string);
        } catch (RecoverableException e) {
            System.out.println("Phew! It's all okay");
        } catch (IQuitException e) {
            System.out.println("It's not okay");
        } finally {
            System.out.println("I'm too old for this.");
        }
    }
}
