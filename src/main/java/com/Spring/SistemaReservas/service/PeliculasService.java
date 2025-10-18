package com.Spring.SistemaReservas.service;

import com.Spring.SistemaReservas.entities.Peliculas;
import com.Spring.SistemaReservas.repository.PeliculasRepository;
import com.Spring.SistemaReservas.service.impl.IPeliculasService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PeliculasService implements IPeliculasService {
    private PeliculasRepository peliculasRepository;

    public PeliculasService(PeliculasRepository peliculasRepository) {
        this.peliculasRepository = peliculasRepository;
    }

    @Override
    public List<Peliculas> findAll() {
        return peliculasRepository.findAll();
    }

    @Override
    public Optional<Peliculas> findById(Long id) {
        return peliculasRepository.findById(id);
    }

    @Override
    public boolean eliminar(Long id) {
        return peliculasRepository.eliminar(id);
    }

    @Override
    public Peliculas crear(String titulo, Date año, String descripcion, int duracion, String genero, String director, String idiomas, String imagen, String estado) {
        Peliculas peliculas = new Peliculas();
        peliculas.setTitulo(titulo);
        peliculas.setAño(año);
        peliculas.setDescripcion(descripcion);
        peliculas.setDuracion(duracion);
        peliculas.setGenero(genero);
        peliculas.setDirector(director);
        peliculas.setIdiomas(idiomas);
        peliculas.setImagen(imagen);
        peliculas.setEstado(estado);
        return peliculasRepository.guardar(peliculas);
    }

    @Override
    public Peliculas actualizar(Long id, String titulo, Date año, String descripcion, int duracion, String genero, String director, String idiomas, String imagen, String estado) {
        Optional<Peliculas> actualiz = findById(id);
        if (actualiz.isPresent()){
            Peliculas peliculas = actualiz.get();
            if (peliculas != null){
                peliculas.setTitulo(titulo);
                peliculas.setAño(año);
                peliculas.setDescripcion(descripcion);
                peliculas.setDuracion(duracion);
                peliculas.setGenero(genero);
                peliculas.setDirector(director);
                peliculas.setIdiomas(idiomas);
                peliculas.setImagen(imagen);
                peliculas.setEstado(estado);
                return peliculas;
            }
        }
        return null;
    }
}
