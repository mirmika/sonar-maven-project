package com.example;

/**
 * The Calculator class provides basic arithmetic operations.
 */
public class Calculator {

    /**
     * Adds two numbers together.
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return the sum of num1 and num2
     */
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Subtracts one number from another.
     *
     * @param num1 the number to be subtracted from
     * @param num2 the number to subtract
     * @return the result of num1 minus num2
     */
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two numbers.
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return the product of num1 and num2
     */
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Divides one number by another.
     *
     * @param num1 the dividend
     * @param num2 the divisor
     * @return the quotient of num1 and num2
     * @throws IllegalArgumentException if num2 is zero
     */
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return num1 / num2;
    }
}
