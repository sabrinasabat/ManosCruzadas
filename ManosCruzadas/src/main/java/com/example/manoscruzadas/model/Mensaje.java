package com.example.manoscruzadas.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "mensaje")

public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Genera automaticamente el ID
    @Column(name = "id_mensaje")
    private long idMensaje;

    @Column(name = "mensaje")
    private String mensaje;

    @Column(name = "fecha_envio")
    @CreationTimestamp //crea automaticamente la fecha
    private LocalDateTime fecha_envio;

    @ManyToOne //relacion uno a muchos, así como tenemos en la ddbb
    @JoinColumn(name = "id_usuario_remitente", referencedColumnName = "id_usuario") //JoinColumn especifica la columna de mensaje y referencedColumnName la columna de usuario
    private Usuario usuarioRemitente;

    @ManyToOne //relacion uno a muchos, así como tenemos en la ddbb
    @JoinColumn(name = "id_usuario_destinatario", referencedColumnName = "id_usuario") //JoinColumn especifica la columna de mensaje y referencedColumnName la columna de usuario
    private Usuario usuarioDestinatario;

    @ManyToOne //relacion uno a muchos, así como tenemos en la ddbb
    @JoinColumn(name = "id_match", referencedColumnName = "id_match") //JoinColumn especifica la columna de mensaje y referencedColumnName la columna de match
    private Matches match;

    //no hace falta pasar el fecha_envio en el constructor, ya que se genera automaticamente, así como el id
    public Mensaje(String mensaje, Usuario usuarioRemitente, Usuario usuarioDestinatario, Matches match){
        this.mensaje = mensaje;
        this.usuarioRemitente = usuarioRemitente;
        this.usuarioDestinatario = usuarioDestinatario;
        this.match = match;
    }

    public Mensaje(){

    }

    public long getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(long id_mensaje) {
        this.idMensaje = id_mensaje;
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

    public Usuario getUsuarioRemitente() {
        return usuarioRemitente;
    }

    public void setUsuarioRemitente(Usuario usuarioRemitente) {
        this.usuarioRemitente = usuarioRemitente;
    }

    public Usuario getUsuarioDestinatario() {
        return usuarioDestinatario;
    }

    public void setUsuarioDestinatario(Usuario usuarioDestinatario) {
        this.usuarioDestinatario = usuarioDestinatario;
    }

    public Matches getMatch() {
        return match;
    }

    public void setMatch(Matches match) {
        this.match = match;
    }
}
