package br.edu.usf;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {

    private static Calculator calculator;

    @BeforeAll
    public static void prepareTest() {
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        final double sum = calculator.sum(10, 50);
        assertEquals(60, sum);
    }

    @Test
    public void testSubtraction() {
        final double subtraction = calculator.subtraction(47, 50);
        assertEquals(-3, subtraction);
    }

    @Test
    public void testMultiplication() {
        final double multiplication = calculator.multiplication(42, 7);
        assertEquals(294, multiplication);
    }

    @Test
    public void testDivision() {
        final double division = calculator.division(49, 7);
        assertEquals(7, division);
    }

    @Test
    public void testDivisionByZero() {
        try {
            calculator.division(10, 0);
            fail();

        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
}
