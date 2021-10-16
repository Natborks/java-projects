package model;

import model.quizExceptions.*;

public class Quiz {
    public static class A {
        public void doA(String string) throws BadException, IQuitException, ReallyBadException {
            if (string.length() > 1) {
                B b = new B();
                try {
                    b.doB(string);
                } catch (OhNoException e) {
                    System.out.println("Oh no!");
                    throw new IQuitException();
                }
            } else {
                throw new BadException();
            }
            System.out.println("I knew I shouldn't have taken this job.");
        }
    }
    public static class B {
        public void doB(String string) throws OhNoException, ReallyBadException {
            assert(string.length() > 1);
            C c = new C();
            try {
                c.doC(string);
            } catch (TooLongException e) {
                System.out.println("Too long? This is bad. Is it really bad?");
                if (string.length() > 5) {
                    System.out.println("It's Bad!");
                    throw new ReallyBadException();
                } else if (string.length() > 3) {
                    System.out.println("Really Bad!");
                    throw new OhNoException();
                }
            } finally {
                System.out.println("I should call my manager!");
            }
        }
    }
    public static class C {
        public void doC(String string) throws TooLongException {
            System.out.println("Today's going to be a good day!");
            if (string.length() > 5) {
                throw new TooLongException();
            } else {
                System.out.println("The word of the day is " + string + "!");
            }
        }
    }

}

