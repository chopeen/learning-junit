package org.chopeen.learning;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest4 {
    private static Calculator calc;

    @BeforeClass
    public static void setup() {
        calc = new Calculator();
    }

    @Test
    public void test_getSquare() {
        assertTrue(calc.getSquare(1) > 0);
        assertTrue(calc.getSquare(2) > 0);
        assertTrue(calc.getSquare(3) > 0);
    }
}
