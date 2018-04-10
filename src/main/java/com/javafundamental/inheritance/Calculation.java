package com.javafundamental.inheritance;

public class Calculation {
    int result = 0;

    public void addition(int x, int y) {
        result = x + y;
        System.out.printf("%d + %d = %d%n", x, y, result);
    }

    public  void subtraction(int x, int y) {
        result = x - y;
        System.out.printf("%d - %d = %d%n", x, y, result);
    }

    public void displayResult() {
        StringBuilder sb = new StringBuilder();
        sb.append("The Calculation Result is : ");
        sb.append(result);
        System.out.println(sb);
    }
}
