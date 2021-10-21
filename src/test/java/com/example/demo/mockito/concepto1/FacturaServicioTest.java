package com.example.demo.mockito.concepto1;

import com.example.demo.pruebamock1.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FacturaServicioTest {

    @Test
    void calcularPrecioJunit() {
        // JUNIT
        // FacturaServicio --> Calculadora --> OperacionesMatematicas --> OperacionesAritmeticas
        // preparar escenario
        OperacionesAritmeticas aritmeticas = new OperacionesAritmeticas();
        OperacionesMatematicas operaciones = new OperacionesMatematicas(aritmeticas);
        Calculadora calculadora = new Calculadora(operaciones);
        FacturaServicio facturaServicio = new FacturaServicio(calculadora);
        Factura factura = new Factura(1L, 20d, 2, 5d, 0.20);

        // ejecutar comportamiento a testear
        double result = facturaServicio.calcularPrecio(factura);

        // aserciones
        assertEquals(48.4, result);
    }

    @Test
    void calcularPrecioMockito() {
        // MOCKITO
        // FacturaServicio --> Mock Calculadora

        // configurar entorno
        Calculadora calculadoraMock = mock(Calculadora.class);
        FacturaServicio facturaServicio = new FacturaServicio(calculadoraMock);
        when(
                calculadoraMock.calcularIVA(anyDouble())
        ).thenReturn(21.0);


        // ejecutar comportamiento a testear
        Factura factura = new Factura(1L, 20d, 5, 5d, 0.20);
        double result = facturaServicio.calcularPrecio(factura);
        assertEquals(121, result);

        // verificaciones mockito:
        verify(calculadoraMock, times(2)).calcularIVA(100.0);
        verify(calculadoraMock, never()).calcularIVAPlus(anyDouble());
    }
}