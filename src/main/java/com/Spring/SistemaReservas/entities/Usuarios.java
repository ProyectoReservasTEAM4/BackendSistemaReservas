package com.Spring.SistemaReservas.entities;

public class Usuarios {
    private Long id_usuario;
    private String nombre;
    private String correo;
    private String contraseña;
    private String foto;

    public Usuarios() {
    }

    public Usuarios(Long id_usuario, String nombre, String correo, String contraseña, String foto) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.foto = foto;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
