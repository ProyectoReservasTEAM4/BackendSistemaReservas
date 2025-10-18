package com.Spring.SistemaReservas.service.impl;

import com.Spring.SistemaReservas.entities.Peliculas;

import java.util.*;

public interface IPeliculasService {
    List<Peliculas> findAll();
    Optional<Peliculas> findById(Long id);
    boolean eliminar(Long id);
    Peliculas crear(String titulo, Date año, String descripcion,
                    int duracion, String genero, String director,
                    String idiomas, String imagen, String estado);

    Peliculas actualizar(Long id, String titulo, int duracion, String genero, String idiomas,String imagen);


}
