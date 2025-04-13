package com.example.manoscruzadas.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "mensaje")

public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Genera automaticamente el ID
    private long id_mensaje;

    @Column(name = "mensaje")
    private String mensaje;

    @Column(name = "fecha_envio")
    @CreationTimestamp //crea automaticamente la fecha
    private LocalDateTime fecha_envio;

    @ManyToOne //relacion uno a muchos, así como tenemos en la ddbb
    @JoinColumn(name = "id_usuario_remitente", referencedColumnName = "id_usuario") //JoinColumn especifica la columna de mensaje y referencedColumnName la columna de usuario
    private Usuario usuario_remitente;

    @ManyToOne //relacion uno a muchos, así como tenemos en la ddbb
    @JoinColumn(name = "id_usuario_destinatario", referencedColumnName = "id_usuario") //JoinColumn especifica la columna de mensaje y referencedColumnName la columna de usuario
    private Usuario usuario_destinatario;

    @ManyToOne //relacion uno a muchos, así como tenemos en la ddbb
    @JoinColumn(name = "id_match", referencedColumnName = "id_match") //JoinColumn especifica la columna de mensaje y referencedColumnName la columna de match
    private Matches match;

    //no hace falta pasar el fecha_envio en el constructor, ya que se genera automaticamente, así como el id
    public Mensaje(String mensaje, Usuario usuario_remitente, Usuario usuario_destinatario, Matches id_match){
        this.mensaje = mensaje;
        this.usuario_remitente = usuario_remitente;
        this.usuario_destinatario = usuario_destinatario;
        this.match = id_match;
    }

    public Mensaje(){

    }

    public long getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(long id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDateTime getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(LocalDateTime fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public Usuario getUsuario_remitente() {
        return usuario_remitente;
    }

    public void setUsuario_remitente(Usuario usuario_remitente) {
        this.usuario_remitente = usuario_remitente;
    }

    public Usuario getUsuario_destinatario() {
        return usuario_destinatario;
    }

    public void setUsuario_destinatario(Usuario usuario_destinatario) {
        this.usuario_destinatario = usuario_destinatario;
    }

    public Matches getMatch() {
        return match;
    }

    public void setMatch(Matches id_match) {
        this.match = id_match;
    }
}
