package com.Spring.SistemaReservas.repository;

import com.Spring.SistemaReservas.entities.Carrito;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class CarritoRepository {
    List<Carrito> listaCarritoDeUsuario = new ArrayList<>();
    long idsiguiente = 0;

    public Carrito guardar(Carrito carrito){
        if (carrito.getId()== null){
            idsiguiente++;
            carrito.setId(idsiguiente);
            listaCarritoDeUsuario.add(carrito);
            return carrito;
        }
        return carrito;
    }

    public List<Carrito> findAll(){
        return listaCarritoDeUsuario;
    }

    public Optional<Carrito> findById(Long id){
        return listaCarritoDeUsuario.stream().filter(carrito -> carrito.getId().
                        equals(id)).
                findFirst();
    }

    public boolean eliminar(Long id){
        return listaCarritoDeUsuario.removeIf(carrito -> carrito.getId().equals(id));
    }
}
