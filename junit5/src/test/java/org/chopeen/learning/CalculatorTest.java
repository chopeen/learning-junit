package org.chopeen.learning;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {
    private static Calculator calc;

    @BeforeAll
    public static void setup() {
        calc = new Calculator();
    }

    @DisplayName("Square")
    @ParameterizedTest(name = "Result for `{0}` should be positive")
    @ValueSource(ints = { 1, 2, 3 })
    public void test_getSquare(int num) {
        assertTrue(calc.getSquare(num) > 0);
    }
}
