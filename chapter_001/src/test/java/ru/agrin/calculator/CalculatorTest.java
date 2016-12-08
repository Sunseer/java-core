package ru.agrin.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculatorTest
{
    @Test
    public void whenUseAddMethod()
    {
        Calculator calc = new Calculator();
        calc.add(1, 1);
        double result = calc.result; // result() ????
        assertThat(result, is (2d));
    }

    @Test
    public void whenUseSubstructMethod()
    {
        Calculator calc = new Calculator();
        calc.substruct(2, 1);
        double result = calc.result; // result() ????
        assertThat(result, is (1d));
    }

    @Test
    public void whenUseDivMethod()
    {
        Calculator calc = new Calculator();
        calc.div(6, 2);
        double result = calc.result; // result() ????
        assertThat(result, is (3d));
    }

    @Test
    public void whenUseMultipleMethod()
    {
        Calculator calc = new Calculator();
        calc.multiple(6, 2);
        double result = calc.result; // result() ????
        assertThat(result, is (12d));
    }
}