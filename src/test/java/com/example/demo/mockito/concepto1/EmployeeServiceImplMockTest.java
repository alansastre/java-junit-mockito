package com.example.demo.mockito.concepto1;

import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.EmployeeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test CON mockito
 *
 * Clase EmployeeServiceImpl con una dependencia EmployeeRepositoryImpl
 */
public class EmployeeServiceImplMockTest {

    EmployeeRepository repository; // dependencia
    EmployeeService service; // SUT (System Under Test) dependiente

    @BeforeEach
    void setUp() {
        repository = mock(EmployeeRepository.class);
        service = new EmployeeServiceImpl(repository);
    }

    @Test
    void count() {

        // given (Preparar el escenario)
        when(repository.count()).thenReturn(3);

        // when (ejecutar el comportamiento a testear)
        Integer result = service.count();

        // then (aserciones y verificaciones)
        assertNotNull(result);
        assertEquals(3, result);
    }
}
