package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testMultiplyPositiveNumbers() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void testMultiplyWithZero() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.multiply(7, 0));
    }

    @Test
    void testMultiplyNegativeNumbers() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.multiply(-3, -5));
    }
}