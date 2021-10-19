package com.example.demo.service.concepto1;

import com.example.demo.domain.SmartPhone;
import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Las aserciones permiten realizar comprobaciones sobre el código a testear.
 *
 * Si se cumplen las aserciones entonces el test es correcto y se ejecuta con éxito resultando en color verde.
 * Si no se cumplen las aserciones entonces el test es fallido y aparecerá en rojo
 */
public class AssertionsTest {

    @Test
    void countTest(){
        System.out.println("countTest");

        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();

        Integer num = service.count();

        assertNotNull(num);
        assertTrue(num > 0);
        assertEquals(3, num);

    }

    @Test
    void findAllTest(){
        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();
        List<SmartPhone> smartphones =  service.findAll();

        assertNotNull(smartphones);
        assertEquals(3, smartphones.size());
    }
}
