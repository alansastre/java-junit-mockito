package com.example.demo.service.concepto3;

import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * El método assertAll() permite evaluar múltiples assert a la vez
 * independientemente de que uno de ellos falle, no detiene la ejecución de los demás assert
 */
public class AssertAllTest {

    @Test
    void countTest(){
        System.out.println("countTest");

        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();

        Integer num = service.count();

        // Si falla una, las que están a continuación no se ejecutan
        assertNull(num); // este da error
        assertTrue(num > 0); // no se evalúa
        assertEquals(5, num); // no se evalúa
}

    @Test
    void countTest2(){
        System.out.println("countTest");

        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();

        Integer num = service.count(); // 3

        // Si falla una, las que están a continuación sí se ejecutan y te reporta múltiples fallos
        // si los hay
        assertAll(
                () -> assertNull(num), // este da error
                () -> assertTrue(num > 0), // este sí se evalúa, no da error
                () -> assertEquals(5, num), // este sí se evalúa, pero da error
                () -> assertFalse(num < 0) // este sí se evalúa
        );

    }

}
