package com.example.demo.pruebamock1;

public class Calculadora {

    private OperacionesMatematicas operaciones;

    public Calculadora(OperacionesMatematicas operaciones){
        this.operaciones = operaciones;
    }

    public double calcularIVA(double cantidad){
        System.out.println("Calculadora.calcularIVA()");
        return cantidad * operaciones.ponderar(0.21);
    }

    public double calcularIVAPlus(double cantidad){
        System.out.println("Calculadora.calcularIVA()");
        return cantidad * operaciones.ponderar(0.21);
    }
}
