package com.example.demo.pruebamock1;

public class OperacionesMatematicas {

    private OperacionesAritmeticas aritmeticas;

    public OperacionesMatematicas(OperacionesAritmeticas aritmeticas) {
        this.aritmeticas = aritmeticas;
    }

    public double ponderar(double cantidad){
        System.out.println("OperacionesMatematicas.ponderar()");
        aritmeticas.calculoFicticio(2);
        return cantidad * 1;
    }
}
