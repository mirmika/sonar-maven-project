package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The CalculatorTest class contains unit tests for the Calculator class.
 */
public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        double result = calculator.add(5, 3);
        assertEquals(8, result, 0);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        double result = calculator.subtract(5, 3);
        assertEquals(2, result, 0);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(5, 3);
        assertEquals(15, result, 0);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(6, 3);
        assertEquals(2, result, 0);
    }

    @Test
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        // Using assertThrows to check that an exception is thrown
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(5, 0);
        });
    }
}
