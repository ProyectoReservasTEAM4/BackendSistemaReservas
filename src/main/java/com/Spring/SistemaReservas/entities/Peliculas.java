package com.Spring.SistemaReservas.entities;
import java.util.*;
public class Peliculas {
    private Long id;
    private String titulo;
    private Date año;
    private String descripcion;
    private int duracion;
    private String genero;
    private String director;
    private String idiomas;
    private String imagen;
    private String estado;


    public Peliculas() {
    }


    public Peliculas(Long id, String titulo, Date año,
                     String descripcion, int duracion, String genero,
                     String director, String idiomas, String imagen, String estado) {

        this.id = id;
        this.titulo = titulo;
        this.año = año;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.genero = genero;
        this.director = director;
        this.idiomas = idiomas;
        this.imagen = imagen;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
