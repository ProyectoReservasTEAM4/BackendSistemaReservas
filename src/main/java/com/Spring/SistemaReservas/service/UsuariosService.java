package com.Spring.SistemaReservas.service;

import com.Spring.SistemaReservas.entities.Usuarios;
import com.Spring.SistemaReservas.repository.UsuariosRepository;
import com.Spring.SistemaReservas.service.impl.IUsuariosService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService implements IUsuariosService {

    private final UsuariosRepository usuariosRepository;

    public UsuariosService(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    @Override
    public List<Usuarios> findAll() {
        return usuariosRepository.findAll();
    }

    @Override
    public Optional<Usuarios> findById(Long id) {
        return usuariosRepository.findById(id);
    }

    @Override
    public boolean eliminar(Long id) {
        return usuariosRepository.eliminar(id);
    }

    @Override
    public Usuarios crear(String nombre, String correo, String contrasena, String foto) {
        Usuarios usuario = new Usuarios();
        usuario.setNombre(nombre);
        usuario.setCorreo(correo);
        usuario.setContraseña(contrasena); // Puedes mantener la ñ si tu clase la tiene
        usuario.setFoto(foto);
        return usuariosRepository.guardar(usuario);
    }

    @Override
    public Usuarios actualizar(Long id, String nombre, String correo, String contrasena, String foto) {
        Optional<Usuarios> actualiz = findById(id);
        if (actualiz.isPresent()) {
            Usuarios usuario = actualiz.get();
            usuario.setNombre(nombre);
            usuario.setCorreo(correo);
            usuario.setContraseña(contrasena);
            usuario.setFoto(foto);
            return usuario;
        }
        return null;
    }
}
