package com.Spring.SistemaReservas.controllers;

import com.Spring.SistemaReservas.entities.Reservas;
import com.Spring.SistemaReservas.service.impl.IReservasService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reservas")
public class ReservasControllers {
    private IReservasService iReservasService;

    public ReservasControllers(IReservasService iReservasService){
        this.iReservasService = iReservasService;
    }

    @GetMapping("/todos")
    public List<Reservas> findAll(){
        return iReservasService.findAll();
    }

    @PostMapping("/crear")
    public Reservas crear(@RequestParam String nombre, @RequestParam Date fechareserva, @RequestParam String estado, @RequestParam String metodopago){
        return iReservasService.crear(nombre,fechareserva,estado,metodopago);
    }

    @GetMapping("/{id}")
    public Optional<Reservas> findById(@PathVariable Long id){
        return iReservasService.findById(id);
    }

    @PutMapping("/{id}/actualizar")
    public Reservas actualizar (@PathVariable Long id,@RequestParam String estado){
        return iReservasService.actualizar(id,estado);
    }

    @DeleteMapping("/{id}")
    public boolean eliminar(Long id){
        return iReservasService.eliminar(id);
    }


}