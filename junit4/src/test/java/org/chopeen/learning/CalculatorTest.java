package org.chopeen.learning;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private static Calculator calc;
    private Integer parameterValue;

    public CalculatorTest(Integer value) {
        this.parameterValue = value;
    }

    @BeforeClass
    public static void setup() {
        calc = new Calculator();
    }

    @Parameters
    public static Collection<Integer> parameterData() {
        return Arrays.asList(1, 2, 3);
    }

    @Test
    public void test_getSquare() {
        assertTrue(calc.getSquare(this.parameterValue) > 0);
    }
}
