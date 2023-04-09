package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        NumericTest isEven = (n) ->(n % 2 == 0 );
        NumericTest isNegative = (n) -> (n < 0);

        System.out.println(isEven.computeTest(5));
        System.out.println(isNegative.computeTest(-5));


        // reverse string
        MyString reverseStr = (str) -> {
            String result = "";
            for (int i = str.length()-1; i >= 0; i --){
                result += str.charAt(i);
            }

            return result;
        };

        System.out.println(reverseStr.myStringFunction("Lambda Dem"));
    }

    interface NumericTest {
        boolean computeTest(int n);
    }

    interface MyString   {
        String myStringFunction(String str);
    }
}