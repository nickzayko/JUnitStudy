package com.andersen;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator(10,20);

    @Test
    public void shouldCreateCalculatorInstance(){
        assertNotNull(calculator);
    }

    @Test
    public void shouldReturnCorrectSum(){
        assertEquals(30, calculator.calculateSum());
    }
}