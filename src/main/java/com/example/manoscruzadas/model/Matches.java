package com.example.manoscruzadas.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.annotation.processing.Generated;
import java.time.LocalDateTime;

@Entity
@Table(name = "matches")

public class Matches {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Genera automaticamente el valor de ID
    private long id_match;

    @Column(name = "fecha_match", updatable = false) //no se puede actualizar
    @CreationTimestamp //crea automaticamente la fecha
    private LocalDateTime fecha_match;

    @Column(name = "status", nullable = false)
    private EstadoMatch status = EstadoMatch.PENDIENTE; //pendiente, aceptado o rechazado, pero por defecto es pendiente

    @ManyToOne //relacion uno a muchos, así como tenemos en la ddbb
    @JoinColumn(name = "id_usuario1", referencedColumnName = "id_usuario") //JoinColumn especifica la columna de matches y referencedColumnName la columna de usuario
    private Usuario usuario1;

    @ManyToOne //relacion uno a muchos, así como tenemos en la ddbb
    @JoinColumn(name = "id_usuario2", referencedColumnName = "id_usuario") //JoinColumn especifica la columna de matches y referencedColumnName la columna de usuario
    private Usuario usuario2;

    //no hace falta pasar el fecha_match en el constructor, ya que se genera automaticamente, así como el id
    public Matches(EstadoMatch status, Usuario usuario1, Usuario usuario2){
        this.status = status;
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
    }

    public Matches(){

    }

    public long getId_match() {
        return id_match;
    }

    public void setId_match(long id_match) {
        this.id_match = id_match;
    }

    public LocalDateTime getFecha_match() {
        return fecha_match;
    }

    public void setFecha_match(LocalDateTime fecha_match) {
        this.fecha_match = fecha_match;
    }

    public EstadoMatch getStatus() {
        return status;
    }

    public void setStatus(EstadoMatch status) {
        this.status = status;
    }

    public Usuario getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(Usuario usuario1) {
        this.usuario1 = usuario1;
    }

    public Usuario getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(Usuario usuario2) {
        this.usuario2 = usuario2;
    }
}
