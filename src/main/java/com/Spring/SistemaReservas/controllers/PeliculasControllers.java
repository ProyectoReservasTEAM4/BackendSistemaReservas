package com.Spring.SistemaReservas.controllers;

import com.Spring.SistemaReservas.entities.Peliculas;
import com.Spring.SistemaReservas.service.impl.IPeliculasService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculasControllers {
    private IPeliculasService iPeliculasService;


    public PeliculasControllers(IPeliculasService iPeliculasService) {
        this.iPeliculasService = iPeliculasService;
    }

    @PutMapping("/{id}/cambio")
    public Peliculas actualizar(@PathVariable Long id, @RequestParam String titulo, @RequestParam Date año,
                                @RequestParam String descripcion, @RequestParam int duracion,
                                @RequestParam String genero, @RequestParam String director, @RequestParam String idiomas,
                                @RequestParam String imagen, @RequestParam String estado) {
        return iPeliculasService.actualizar(id,titulo,año,descripcion,duracion,genero,director,idiomas,imagen,estado);
    }

    @GetMapping("/todos")
    public List<Peliculas> findAll(){
        return iPeliculasService.findAll();
    }

    @DeleteMapping("/{id}")
    public boolean eliminar(@PathVariable Long id){
        return iPeliculasService.eliminar(id);
    }

    @GetMapping("/{id}")
    public Optional<Peliculas> findById(@PathVariable Long id){
        return iPeliculasService.findById(id);
    }

    @PostMapping("/crear")
    public Peliculas crear(@RequestParam String titulo, @RequestParam Date año,
                                @RequestParam String descripcion, @RequestParam int duracion,
                                @RequestParam String genero, @RequestParam String director, @RequestParam String idiomas,
                                @RequestParam String imagen, @RequestParam String estado) {
        return iPeliculasService.crear(titulo,año,descripcion,duracion,genero,director,idiomas,imagen,estado);
    }



}
