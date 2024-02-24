package org.example;

public class ExceptionClass {
    public static void main(String[] args) {
        int a, b;
        try {
            a = Integer.parseInt("try");
            b = a / 2;
            if (b == 24)
                throw new ArithmeticException();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        finally {
            System.out.println("Test");
        }
    }
}