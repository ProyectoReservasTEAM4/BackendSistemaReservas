package com.Spring.SistemaReservas.entities;
import java.util.*;

public class Reservas {
    private Long id;
    private String nombre;
    private Date fechareserva;
    private String estado;
    private String metodopago;

    public Reservas() {
    }

    public Reservas(Long id, String nombre, Date fechareserva, String estado, String metodopago) {
        this.id = id;
        this.nombre = nombre;
        this.fechareserva = fechareserva;
        this.estado = estado;
        this.metodopago = metodopago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechareserva() {
        return fechareserva;
    }

    public void setFechareserva(Date fechareserva) {
        this.fechareserva = fechareserva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMetodopago() {
        return metodopago;
    }

    public void setMetodopago(String metodopago) {
        this.metodopago = metodopago;
    }


}