package com.Spring.SistemaReservas.controllers;

import com.Spring.SistemaReservas.entities.Usuarios;
import com.Spring.SistemaReservas.service.impl.IUsuariosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")

public class UsuariosControllers {

    private final IUsuariosService iUsuariosService;

    public UsuariosControllers(IUsuariosService iUsuariosService) {
        this.iUsuariosService = iUsuariosService;
    }

    @GetMapping("/listar")
    public List<Usuarios> listarUsuarios() {
        return iUsuariosService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Usuarios> buscarPorId(@PathVariable Long id) {
        return iUsuariosService.findById(id);
    }

    @PostMapping("/crear")
    public Usuarios crearUsuario(@RequestParam String nombre,
                                 @RequestParam String correo,
                                 @RequestParam String contraseña,
                                 @RequestParam String foto) {
        return iUsuariosService.crear(nombre, correo, contraseña, foto);
    }

    @PutMapping("/{id}/editar")
    public Usuarios editarUsuario(@PathVariable Long id,
                                  @RequestParam String nombre,
                                  @RequestParam String correo,
                                  @RequestParam String contraseña,
                                  @RequestParam String foto) {
        return iUsuariosService.actualizar(id, nombre, correo, contraseña, foto);
    }

    @DeleteMapping("/{id}")
    public boolean eliminarUsuario(@PathVariable Long id) {
        return iUsuariosService.eliminar(id);
    }
}

