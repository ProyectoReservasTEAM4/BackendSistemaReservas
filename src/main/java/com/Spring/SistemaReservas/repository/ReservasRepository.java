package com.Spring.SistemaReservas.repository;
import java.util.*;

import com.Spring.SistemaReservas.entities.Reservas;
import org.springframework.stereotype.Repository;

@Repository
public class ReservasRepository {

    List<Reservas> listareservas = new ArrayList<>();
    long idsiguiente = 0;
    public Reservas guarda(Reservas reservas){
        if (reservas.getId() == null){
            idsiguiente++;
            reservas.setId(idsiguiente);
            listareservas.add(reservas);
            return reservas;
        }
        return reservas;
    }

    public List<Reservas> findAll(){
        return listareservas;
    }

    public Optional<Reservas> findById(Long id){
        return listareservas.stream().filter(reservas -> reservas.getId().equals(id)).findFirst();
    }

    public boolean eliminar(Long id){
        return listareservas.removeIf(reservas -> reservas.getId().equals(id));
    }


}