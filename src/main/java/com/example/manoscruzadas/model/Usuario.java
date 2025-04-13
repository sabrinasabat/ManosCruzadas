package com.example.manoscruzadas.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Genera automaticamente el valor de ID
    @Column(name = "id_usuario")
    private long idUsuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "ubicacion")
    private String ubicacion;

    @Column(name = "foto_perfil")
    @Lob //Large Object
    private byte[] foto_perfil; //byte para almacenar imagenes

    @Column(name = "fecha_alta", updatable = false) //no se puede actualizar
    @CreationTimestamp //crea automaticamente la fecha
    private LocalDateTime fecha_alta;

    //no hace falta pasar el fecha_alta en el constructor, ya que se genera automaticamente, así como el id
    public Usuario(String nombre, String email, String password, String ubicacion, byte[] foto_perfil){
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.ubicacion = ubicacion;
        this.foto_perfil = foto_perfil;
    }

    public Usuario(){

    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long id_usuario) {
        this.idUsuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public byte[] getFoto_perfil() {
        return foto_perfil;
    }

    public void setFoto_perfil(byte[] foto_perfil) {
        this.foto_perfil = foto_perfil;
    }

    public LocalDateTime getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(LocalDateTime fecha_alta) {
        this.fecha_alta = fecha_alta;
    }
}
