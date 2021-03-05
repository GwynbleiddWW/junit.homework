package ru.netology.Lambda1;

import org.junit.jupiter.api.Test;

public class CalculatorTestHamcrest {
    @Test
    public void divZero() {
        //given
        Calculator calculator = Calculator.instance.get();
        int a = 1;
        int b = 0;
        int expected = 0;
        //when
        int d = calculator.div2.apply(a, b);
        //then
    }

    @Test
    public void plusSum() {
        //given
        Calculator calculator = Calculator.instance.get();
        int a = 50;
        int b = 50;
        int expected = 100;
        //when
        int d = calculator.plus.apply(a, b);
        //then
    }

    @Test
    public void minusDiff() {
        //given
        Calculator calculator = Calculator.instance.get();
        int a = 100;
        int b = 50;
        int expected = 50;
        //when
        int d = calculator.minus.apply(a, b);
        //then
    }
}
