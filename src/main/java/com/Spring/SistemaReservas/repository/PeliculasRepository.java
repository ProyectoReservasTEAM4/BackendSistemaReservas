package com.Spring.SistemaReservas.repository;

import com.Spring.SistemaReservas.entities.Peliculas;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PeliculasRepository {
    List<Peliculas> listapeliculas = new ArrayList<>();
    long idsiguiente = 0;

    public Peliculas guardar(Peliculas peliculas){
        if (peliculas.getId()== null){
            idsiguiente++;
            peliculas.setId(idsiguiente);
            listapeliculas.add(peliculas);
            return peliculas;
        }
        return peliculas;
    }

    public List<Peliculas> findAll(){
        return listapeliculas;
    }

    public Optional<Peliculas> findById(Long id){
        return listapeliculas.stream().filter(peliculas -> peliculas.getId().
                equals(id)).
                findFirst();
    }

    public boolean eliminar(Long id){
        return listapeliculas.removeIf(peliculas -> peliculas.getId().equals(id));
    }

}
