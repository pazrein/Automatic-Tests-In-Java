package Exercise;

public interface Calculator {

    int add(int first, int second);

    int multiply(int multiplicand, int multiplier);

    /**
     * Throw IllegalArgumentException if divisor == 0 with appropriate message
     */
    int divide(int dividend, int divisor);

    /**
     * Throw IllegalArgumentException if exponent < 0 ith appropriate message
     */
    int squareRoot(int number);
}