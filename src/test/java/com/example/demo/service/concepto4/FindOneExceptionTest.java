package com.example.demo.service.concepto4;

import com.example.demo.domain.SmartPhone;
import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindOneExceptionTest {

    @Test
    void findOnePhone1Test() {

        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();

        SmartPhone phone1  = service.findOne(1L);

        assertNotNull(phone1);
        assertEquals(1L, phone1.getId());
    }

    @Test
    void findOnePhone999Test() {

        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();

        SmartPhone phone1  = service.findOne(999L);

        assertNull(phone1);
    }

    @DisplayName("Comprobar excepción al buscar un smartphone nulo")
    @Test
    void findOneExceptionTest() {

        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();
        // verifica si se ha lanzado una excepción
        assertThrows(IllegalArgumentException.class, () -> service.findOne(null));
    }
}