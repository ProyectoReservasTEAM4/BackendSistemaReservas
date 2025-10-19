package com.Spring.SistemaReservas.service.impl;
import com.Spring.SistemaReservas.entities.Usuarios;
import java.util.*;
public interface IUsuariosService {

    List<Usuarios> findAll();
    Optional<Usuarios> findById(Long id);
    boolean eliminar(Long id);
    Usuarios crear(String nombre, String correo, String contraseña, String foto);
    Usuarios actualizar(Long id, String nombre, String correo, String contraseña, String foto);

}
