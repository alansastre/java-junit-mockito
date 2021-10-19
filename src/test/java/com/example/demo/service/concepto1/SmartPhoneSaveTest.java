package com.example.demo.service.concepto1;

import com.example.demo.domain.SmartPhone;
import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmartPhoneSaveTest {

    @DisplayName("Comprobar excepción cuando el smartphone a guardar es nulo")
    @Test
    void saveNull(){
        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();

        assertThrows(
                IllegalArgumentException.class,
                () -> service.save(null)
        );
    }


}
