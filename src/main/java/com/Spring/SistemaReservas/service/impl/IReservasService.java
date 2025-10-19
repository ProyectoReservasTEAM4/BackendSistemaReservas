package com.Spring.SistemaReservas.service.impl;
import com.Spring.SistemaReservas.entities.Reservas;

import java.util.*;
public interface IReservasService {

    boolean eliminar(Long id);
    Optional<Reservas> findById(Long id);
    List<Reservas> findAll();
    Reservas crear(String nombre, Date fechareserva, String estado, String metodopago);
    Reservas actualizar(Long id, String estado);


}