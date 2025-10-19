package com.Spring.SistemaReservas.entities;

public class Carrito {
    private Long id;
    private int cantidad;
    private float precio;

    public Carrito() {
    }

    public Carrito(Long id, int cantidad, float precio) {
        this.id = id;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
