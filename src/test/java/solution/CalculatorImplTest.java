package solution;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CalculatorImplTest {

    private CalculatorImpl calculator;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        calculator = new CalculatorImpl();
    }

    @Test
    public void add_simpleValues_calculated() {
        assertThat(calculator.add(0, 0), is(0));
        assertThat(calculator.add(-50, 700), is(650));
        assertThat(calculator.add(-80, 820), is(740));
    }

    @Test
    public void multiply_simpleValues_calculated() {
        assertThat(calculator.multiply(2, 5), is(10));
        assertThat(calculator.multiply(0, 1000), is(0));
        assertThat(calculator.multiply(-800, 0), is(0));
    }

    @Test
    public void divide_simpleValues_calculated() {
        assertThat(calculator.divide(0, 1), is(0));
        assertThat(calculator.divide(-8, -2), is(4));
    }

    @Test
    public void divide_divideByZero_throwsIllegalArgumentException() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Cannot divide by zero");
        calculator.divide(2, 0);
    }

    @Test
    public void squareRoot_simpleValues_calculated() {
        assertThat(calculator.squareRoot(9), is(3));
        assertThat(calculator.squareRoot(0), is(0));
    }

    @Test
    public void squareRoot_numberIsNegative_throwsIllegalArgumentException() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Root cant be negative");
        calculator.squareRoot(-5);
    }
}