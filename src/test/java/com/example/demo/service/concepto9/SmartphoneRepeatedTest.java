package com.example.demo.service.concepto9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

/**
 * La anotación @RepeatedTest permite repetir un test un número determinado de veces
 *
 * Cada repetición es considerada como un test independiente
 */
public class SmartphoneRepeatedTest {

    @Test // Anotación de test normal
    void name() {
    }

    @BeforeEach
    void setUp() {
        System.out.println("Ejecutando setUp beforeEach");
    }

    @RepeatedTest(value = 10)
    void test1(){
        System.out.println("Ejecutando test");
    }

    @RepeatedTest(value = 10, name = RepeatedTest.LONG_DISPLAY_NAME)
    void test2(){
        System.out.println("Ejecutando test");
    }
}
