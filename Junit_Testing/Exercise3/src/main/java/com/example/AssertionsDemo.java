package com.example;

public class AssertionsDemo {

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public String getGreeting(String name) {
        if (name == null) {
            return null;
        }
        return "Hello, " + name + "!";
    }

    public int[] getPrimeNumbers() {
        return new int[]{2, 3, 5, 7, 11};
    }
}
