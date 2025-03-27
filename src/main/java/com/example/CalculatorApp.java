package com.example;

/**
 * The CalculatorApp class provides a simple command-line interface
 * for performing basic arithmetic operations.
 */
public class CalculatorApp {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Example calculations
        double num1 = 10.5;
        double num2 = 4.2;

        System.out.println("Add: " + calculator.add(num1, num2));
        System.out.println("Subtract: " + calculator.subtract(num1, num2));
        System.out.println("Multiply: " + calculator.multiply(num1, num2));
        System.out.println("Divide: " + calculator.divide(num1, num2));
    }
}
