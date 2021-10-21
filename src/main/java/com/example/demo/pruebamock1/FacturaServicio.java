package com.example.demo.pruebamock1;

public class FacturaServicio {

    private Calculadora calculadora; // dependencia, atributo, propiedad

    public FacturaServicio(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public double calcularPrecio(Factura factura){
        System.out.println("FacturaServicio.calcularPrecio()");
        double precioTotal = factura.getPrecioBase() * factura.getCantidad();
        double iva = calculadora.calcularIVA(precioTotal);
        iva = calculadora.calcularIVA(precioTotal);
        return precioTotal + iva;
    }
}
