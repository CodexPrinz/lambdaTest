package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        NumericTest isEven = (n) ->(n % 2 == 0 );
        NumericTest isNegative = (n) -> (n < 0);

        System.out.println(isEven.computeTest(5));
        System.out.println(isNegative.computeTest(-5));
    }

    interface NumericTest {
        boolean computeTest(int n);
    }


}