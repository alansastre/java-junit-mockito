package com.example.demo.service.concepto7;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Anotaciones para ejecución de tests de forma condicional, en base a condiciones")
public class ConditionalTest {

    @BeforeAll
    static void beforeAll(){
        // Imprimir las propiedades del sistema
        System.getProperties().forEach(
                (key, value) -> System.out.println(key + " " + value)
        );

        // Imprimir variables de entorno
        System.getenv().forEach(
                (key, value) -> System.out.println(key + " " + value)
        );
    }


    // Sistema Operativo
    @EnabledOnOs(OS.LINUX)
    @Test
    public void test1(){
        System.out.println("test1");
        assertTrue(true);
    }

    // JDK

    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void test2(){
        System.out.println("test2");
        assertTrue(true);
    }

    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    @Test
    void test3(){
        System.out.println("test2");
        assertTrue(true);
    }



    @EnabledIfEnvironmentVariable(named="USERNAME", matches = "testing")
    @Test
    void test5(){
        System.out.println("test4");
        assertTrue(true);
    }

    @EnabledIfEnvironmentVariable(named="OS", matches = "Windows_NT")
    @Test
    void test6(){
        System.out.println("test4");
        assertTrue(true);
    }
}
