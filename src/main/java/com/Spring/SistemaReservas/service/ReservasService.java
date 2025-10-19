package com.Spring.SistemaReservas.service;
import com.Spring.SistemaReservas.entities.Reservas;
import com.Spring.SistemaReservas.repository.ReservasRepository;
import com.Spring.SistemaReservas.service.impl.IReservasService;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class ReservasService implements IReservasService {

    private ReservasRepository reservasRepository;

    public ReservasService (ReservasRepository reservasRepository){
        this.reservasRepository=reservasRepository;
    }


    @Override
    public boolean eliminar(Long id) {
        return reservasRepository.eliminar(id);
    }

    @Override
    public Optional<Reservas> findById(Long id) {
        return reservasRepository.findById(id);
    }

    @Override
    public List<Reservas> findAll() {
        return reservasRepository.findAll();
    }

    @Override
    public Reservas crear(String nombre, Date fechareserva, String estado, String metodopago) {
        Reservas reservas = new Reservas();
        reservas.setNombre(nombre);
        reservas.setFechareserva(fechareserva);
        reservas.setEstado(estado);
        reservas.setMetodopago(metodopago);
        return reservasRepository.guarda(reservas);
    }

    @Override
    public Reservas actualizar(Long id, String estado) {
        Optional<Reservas> actualizar = findById(id);
        if (actualizar.isPresent()){
            Reservas reservas = actualizar.get();
            if (reservas != null){
                reservas.setEstado(estado);
                return reservas;
            }
        }
        return null;
    }
}