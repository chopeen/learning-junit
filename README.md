# Learning JUnit

Run the tests with `mvn clean package` or `mvn test`.

## Parameterized tests in JUnit 5

`ParameterizedTest` is marked as experimental (`@API(status = EXPERIMENTAL, since = "5.0")`).

### Failing test

**Parameters:** `@ValueSource(ints = { 0, 1, 2, 3 })`

**Result:**

    [INFO] -------------------------------------------------------
    [INFO]  T E S T S
    [INFO] -------------------------------------------------------
    [INFO] Running org.chopeen.learning.CalculatorTest
    [ERROR] Tests run: 4, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 0.203 s <<< FAILURE! - in org.chopeen.learning.CalculatorTest
    [ERROR] test_getSquare{int}[1]  Time elapsed: 0.095 s  <<< FAILURE!
    org.opentest4j.AssertionFailedError: expected: <true> but was: <false>
            at org.chopeen.learning.CalculatorTest.test_getSquare(CalculatorTest.java:20)

### Passing test

**Parameters:** `@ValueSource(ints = { 1, 2, 3 })`

**Result:**

    [INFO] -------------------------------------------------------
    [INFO]  T E S T S
    [INFO] -------------------------------------------------------
    [INFO] Running org.chopeen.learning.CalculatorTest
    [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.182 s - in org.chopeen.learning.CalculatorTest

## Parameterized tests in JUnit 4

...
