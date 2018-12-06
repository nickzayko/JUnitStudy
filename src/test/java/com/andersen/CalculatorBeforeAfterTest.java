package com.andersen;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorBeforeAfterTest {

    private Calculator calculator = new Calculator();

    private int firstNumber;
    private int secondNumber;

//    указываются операции, которые запускаются перед каждым тестом
    @Before
    public void setUp() throws Exception {
        firstNumber = 100;
        secondNumber = 200;
        calculator.setFirstNumber(firstNumber);
        calculator.setSecondNumber(secondNumber);
    }
//    ==============================================================

    @Test
    public void shouldCreateCalculatorWithSetUpValues(){
        assertEquals(firstNumber, 100);
        assertEquals(secondNumber, 200);
    }

    @Test
    public void shouldReturnCorrectSum(){
        assertEquals(300, calculator.calculateSum());
    }

//    @After
//    public void tearDown() throws Exception {
//    }

}