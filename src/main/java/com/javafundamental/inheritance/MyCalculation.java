package com.javafundamental.inheritance;

public class MyCalculation extends Calculation {
    private int result = 0;

    public void multiplication(int x, int y) {
        result = x * y;
        System.out.printf("%d * %d = %d%n", x, y, result);
    }

    public void displayResult() {
        System.out.println("MyCalculation Result is : " + result);
    }

//    Invoke super class method
    public void calculationDisplay() {
        super.displayResult();
    }

    public static void main(String[] args) {
        MyCalculation myCalc = new MyCalculation();

        myCalc.multiplication(2,3);
        myCalc.addition(4,5);
        myCalc.subtraction(10,8);
        myCalc.displayResult();
        myCalc.calculationDisplay();
    }
}
