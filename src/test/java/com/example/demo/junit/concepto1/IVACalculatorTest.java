package com.example.demo.junit.concepto1;

import com.example.demo.service.IVACalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IVACalculatorTest {

    IVACalculator calculator = new IVACalculator();

    @Test
    void calculateIVATest(){

        double result = calculator.calculateIVA(100);
        assertEquals(21, result);
    }

    @Test
    void calculateIVAZeroTest(){

        double result = calculator.calculateIVA(0);
        assertEquals(0, result);
    }

    @Test
    void calculateIVANegativeTest(){

        double result = calculator.calculateIVA(-100);
        assertEquals(-21, result);
    }
}
