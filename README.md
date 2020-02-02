# Learning JUnit

Run the tests with `mvn clean package` or `mvn test`.

## Naming convention

By default, Maven looks for tests to run in files named:

- `Test*.java`
- `*Test.java`
- `*Tests.java`
- `*TestCases.java`

This can be changed in [Surefire configuration](https://maven.apache.org/surefire/maven-surefire-plugin/test-mojo.html#includes).

## Parameterized tests in JUnit 5

`ParameterizedTest` is marked as experimental (`@API(status = EXPERIMENTAL, since = "5.0")`).

### Failing test

Parameters:

    @ValueSource(ints = { 0, 1, 2, 3 })

Result:

    [INFO] -------------------------------------------------------
    [INFO]  T E S T S
    [INFO] -------------------------------------------------------
    [INFO] Running org.chopeen.learning.CalculatorTest
    [ERROR] Tests run: 4, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 0.203 s <<< FAILURE! - in org.chopeen.learning.CalculatorTest
    [ERROR] test_getSquare{int}[1]  Time elapsed: 0.095 s  <<< FAILURE!
    org.opentest4j.AssertionFailedError: expected: <true> but was: <false>
            at org.chopeen.learning.CalculatorTest.test_getSquare(CalculatorTest.java:20)

### Passing test

Parameters:

    @ValueSource(ints = { 1, 2, 3 })

Result:

    [INFO] -------------------------------------------------------
    [INFO]  T E S T S
    [INFO] -------------------------------------------------------
    [INFO] Running org.chopeen.learning.CalculatorTest
    [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.182 s - in org.chopeen.learning.CalculatorTest

## Parameterized tests in JUnit 4

### Failing test

Parameters:

    @Parameters
    public static Collection<Integer> parameterData() {
        return Arrays.asList(0, 1, 2, 3);
    }

Result:

    -------------------------------------------------------
    T E S T S
    -------------------------------------------------------
    Running org.chopeen.learning.CalculatorTest
    Tests run: 4, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 0.144 sec <<< FAILURE!
    test_getSquare[0](org.chopeen.learning.CalculatorTest)  Time elapsed: 0.013 sec  <<< FAILURE!
    java.lang.AssertionError
            at org.junit.Assert.fail(Assert.java:86)
            at org.junit.Assert.assertTrue(Assert.java:41)
            at org.junit.Assert.assertTrue(Assert.java:52)
            at org.chopeen.learning.CalculatorTest.test_getSquare(CalculatorTest.java:36)
            at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
            at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
            at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
            at java.lang.reflect.Method.invoke(Method.java:498)
            at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
            at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
            at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
            at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
            at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
            at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
            at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
            at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
            at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
            at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
            at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
            at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
            at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
            at org.junit.runners.Suite.runChild(Suite.java:128)
            at org.junit.runners.Suite.runChild(Suite.java:27)
            at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
            at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
            at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
            at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
            at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
            at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
            at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
            at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:252)
            at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:141)
            at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:112)
            at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
            at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
            at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
            at java.lang.reflect.Method.invoke(Method.java:498)
            at org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:189)
            at org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:165)
            at org.apache.maven.surefire.booter.ProviderFactory.invokeProvider(ProviderFactory.java:85)
            at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:115)
            at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:75)

    Results :

    Failed tests:   test_getSquare[0](org.chopeen.learning.CalculatorTest)

    Tests run: 4, Failures: 1, Errors: 0, Skipped: 0

### Passing test

Parameters:

    @Parameters
    public static Collection<Integer> parameterData() {
        return Arrays.asList(1, 2, 3);
    }

Result:

    -------------------------------------------------------
    T E S T S
    -------------------------------------------------------
    Running org.chopeen.learning.CalculatorTest
    Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.134 sec

    Results :

    Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
