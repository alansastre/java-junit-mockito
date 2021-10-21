package com.example.demo.mockito.concepto1;

import com.example.demo.domain.Employee;
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
 *
 * EmployeeServiceImpl --> EmployeeRepositoryImpl
 * EmployeeServiceImpl --> Mock
 */
public class EmployeeServiceImplMockTest {

    EmployeeRepository repositoryMock; // dependencia
    EmployeeService service; // SUT (System Under Test) dependiente

    @BeforeEach
    void setUp() {
        repositoryMock = mock(EmployeeRepository.class);
        service = new EmployeeServiceImpl(repositoryMock);
    }

    @Test
    void count() {

        // given (Preparar el escenario - configurar mocks)
        when(repositoryMock.count()).thenReturn(3);

        // when (ejecutar el comportamiento a testear)
        Integer result = service.count();

        // then (aserciones y verificaciones)
        assertNotNull(result);
        assertEquals(3, result);
    }

    @Test
    void findOneTest() {

        // preparar escenario - configurar mocks
        Employee empleado = new Employee(1L, "Empleado1", 45);
        when(repositoryMock.findOne(1L)).thenReturn(empleado);

        // ejecutar comportamiento
        Employee result = service.findOne(1L);

        // aserciones
        assertNotNull(result);
        assertEquals(1, result.getId());

    }

    @Test
    void findOneAnyTest() {

        // preparar escenario - configurar mocks
        Employee empleado = new Employee(2L, "Empleado2", 45);
        when(repositoryMock.findOne(anyLong())).thenReturn(empleado);

        // ejecutar comportamiento
        Employee result = service.findOne(2L);

        // aserciones
        assertNotNull(result);
        assertEquals(2, result.getId());

        verify(repositoryMock).findOne(4L);
    }
}
