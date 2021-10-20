package com.example.demo.junit.concepto5;

import com.example.demo.domain.SmartPhone;
import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Ciclo de vida JUnit
 * @BeforeEach antes de cada test
 * @AfterEach después de cada test
 */
public class LifeCycleMethodTest {

    SmartPhoneServiceImpl service;

    /**
     * Se ejecuta antes de cada método de test
     */
    @BeforeEach
    void setUp(){
        System.out.println("setUp");
        service = new SmartPhoneServiceImpl();
    }

    /**
     * Se ejecuta después de cada método de test
     */
    @AfterEach
    void tearDown(){
        System.out.println("tearDown");
    }

    @Test
    void countTest(){
        System.out.println("countTest");

        Integer num = service.count();

        assertNotNull(num);
        assertTrue(num > 0);
        assertEquals(3, num);

    }

    @Test
    void findAllTest(){
        System.out.println("findAllTest");
        List<SmartPhone> smartphones =  service.findAll();

        assertNotNull(smartphones);
        assertEquals(3, smartphones.size());
    }
}
