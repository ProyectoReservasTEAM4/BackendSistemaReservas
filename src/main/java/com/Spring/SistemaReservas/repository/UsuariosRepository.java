package com.Spring.SistemaReservas.repository;

import com.Spring.SistemaReservas.entities.Usuarios;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository

public class UsuariosRepository {

    List<Usuarios> listaUsuarios = new ArrayList<>();
    long idSiguiente = 0;

    public Usuarios guardar(Usuarios usuarios) {
        if (usuarios.getId_usuario() == null) {
            idSiguiente++;
            usuarios.setId_usuario(idSiguiente);
            listaUsuarios.add(usuarios);
            return usuarios;
        }
        return usuarios;
    }

    public List<Usuarios> findAll() {
        return listaUsuarios;
    }

    public Optional<Usuarios> findById(Long id) {
        return listaUsuarios.stream()
                .filter(usuario -> usuario.getId_usuario().equals(id))
                .findFirst();
    }

    public boolean eliminar(Long id) {
        return listaUsuarios.removeIf(usuario -> usuario.getId_usuario().equals(id));
    }
}
