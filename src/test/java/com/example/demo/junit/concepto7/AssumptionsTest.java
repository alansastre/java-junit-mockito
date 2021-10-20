package com.example.demo.junit.concepto7;


import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

/**
 * Assumptions se utilizan para evaluar una condición externa como por ejemplo:
 * nombre de usuario en una variable de entorno
 * la existencia de un software
 * .....
 *
 * Si se cumple la condición entonces el test se ejecuta
 *
 * Si no se cumple la condición entonces el test se deshabilita (NO FALLA!, se deshabilita)
 */
@DisplayName("Assumptions permite deshabilitar tests si no se cumplen ciertas condiciones programadas")
public class AssumptionsTest {

    @Test
    void test1(){
        // comprobar que el entorno cumple ciertas precondiciones antes de ejecutar el test
        String username = System.getenv("USERNAME");
        assumeTrue(username.equals("pc_testing"));

        // ejecución del test: este código se ejecuta sólo si el USERNAME del ordenador
        // en el que se está ejecutando este test se llama "pc_testing"
        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();

        Integer num = service.count();

        assertNotNull(num);
        assertTrue(num > 0);
        assertEquals(3, num);

    }

    @Test
    void test2(){
        // comprobar que el entorno cumple ciertas precondiciones antes de ejecutar el test
        String username = System.getenv("USERNAME");
        assumeTrue(username.equals("pc_testing2"));

        // ejecución del test: este código se ejecuta sólo si el USERNAME del ordenador
        // en el que se está ejecutando este test se llama "pc_testing2"
        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();

        Integer num = service.count();

        assertNotNull(num);
        assertTrue(num > 0);
        assertEquals(3, num);

    }
}
