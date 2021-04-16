package com.kodilla;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Wynik dodawania licz A i B to: " + addAToB(10, 6));
        System.out.println("Wynik odejmowania liczb A i B to: " + subtractAFromB(14, 5));
    }

    static int addAToB(int a, int b) {
        return a + b;
    }

    static int subtractAFromB(int a, int b) {
        return a - b;
    }

}

