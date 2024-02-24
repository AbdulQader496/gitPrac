package org.example;

import java.util.ArrayList;

interface Adder {
    int add(int a , int b, int c);
}
public class Main {
    public static void main(String[] args) {
//        Adder adder = (a, b, c) -> a +b -c;
//    int sum = adder.add(5, 5, 11);
//    System.out.println(sum);

        float a = 10;

        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("5");
        numbers.add("Java");
        numbers.add("8");
        numbers.add("1");
        numbers.forEach( (n) -> { System.out.print(n + ", "); } );
    }
}