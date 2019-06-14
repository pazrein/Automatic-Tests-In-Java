package junit.exercise.solution;

import junit.exercise.Calculator;

public class CalculatorImpl implements Calculator {

    public int add(int first, int second) {
        return first + second;
    }

    public int multiply(int multiplicand, int multiplier) {
        return multiplicand * multiplier;
    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0)
            throw new IllegalArgumentException("Cannot divide by zero");

        return dividend / divisor;
    }

    public int squareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Root cant be negative");
        }
        return (int) Math.pow(number, 0.5);
    }
}