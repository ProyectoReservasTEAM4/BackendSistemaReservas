package com.Spring.SistemaReservas.service.impl;

import com.Spring.SistemaReservas.entities.Carrito;

import java.util.List;
import java.util.Optional;

public interface ICarritoService {
    boolean eliminar(Long id);
    Optional<Carrito> findById(Long id);
    List<Carrito> findAll();
    Carrito crear(int cantidad, float precio);
    Carrito actualizar(Long id, int cantidad, float precio);

}
