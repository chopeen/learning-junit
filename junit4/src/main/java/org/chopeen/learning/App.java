package org.chopeen.learning;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int num = 2;
        String output = String.format("The square of %d is %d", num, calc.getSquare(num));
        System.out.println(output);
    }
}
