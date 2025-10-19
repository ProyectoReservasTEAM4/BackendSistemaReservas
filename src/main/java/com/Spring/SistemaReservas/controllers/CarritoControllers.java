package com.Spring.SistemaReservas.controllers;


import com.Spring.SistemaReservas.entities.Carrito;
import com.Spring.SistemaReservas.service.impl.ICarritoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/carrito")
public class CarritoControllers {
    private ICarritoService iCarritoService;

    public CarritoControllers(ICarritoService iCarritoService) {
        this.iCarritoService = iCarritoService;
    }
    @GetMapping("/todos")
    public List<Carrito> findAll(){
        return iCarritoService.findAll();
    }

    @PostMapping("/crear")
    public Carrito crear(@RequestParam int cantidad,@RequestParam float precio){
        return iCarritoService.crear(cantidad, precio);
    }

    @GetMapping("/{id}")
    public Optional<Carrito> findById(@PathVariable Long id){
        return iCarritoService.findById(id);
    }

    @PutMapping("/{id}/actualizar")
    public Carrito actualizar (@PathVariable Long id,@RequestParam int cantidad, @RequestParam float precio){
        return iCarritoService.actualizar(id,cantidad, precio);
    }

    @DeleteMapping("/{id}")
    public boolean eliminar(@PathVariable Long id){
        return iCarritoService.eliminar(id);
    }


}
