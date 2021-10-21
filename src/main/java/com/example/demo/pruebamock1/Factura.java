package com.example.demo.pruebamock1;

public class Factura {

    private Long id;
    private Double precioBase;
    private Integer cantidad;
    private Double precioEnvio;
    private Double IVA;

    public Factura(){}

    public Factura(Long id, Double precioBase, Integer cantidad, Double precioEnvio, Double IVA) {
        this.id = id;
        this.precioBase = precioBase;
        this.cantidad = cantidad;
        this.precioEnvio = precioEnvio;
        this.IVA = IVA;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioEnvio() {
        return precioEnvio;
    }

    public void setPrecioEnvio(Double precioEnvio) {
        this.precioEnvio = precioEnvio;
    }

    public Double getIVA() {
        return IVA;
    }

    public void setIVA(Double IVA) {
        this.IVA = IVA;
    }
}
