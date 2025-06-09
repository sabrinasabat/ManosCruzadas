package com.example.manoscruzadas.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "habilidad_servicio")

public class HabilidadServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Genera automaticamente el valor de ID
    private long id_habilidad;

    @Column(name = "tipo", nullable = false)
    private Tipo tipo; //ofrece o busca

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fecha_alta", updatable = false) //no se puede actualizar
    @CreationTimestamp //crea automaticamente la fecha
    private LocalDateTime fecha_alta;

    @ManyToOne //relacion uno a muchos, así como tenemos en la ddbb
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario") //JoinColumn especifica la columna de habilidad_servicio y referencedColumnName la columna de usuario
    private Usuario usuario;

    @ManyToOne //relacion uno a muchos, así como tenemos en la ddbb
    @JoinColumn(name = "id_subcategoria", referencedColumnName = "id_subcategoria") //JoinColumn especifica la columna de habilidad_servicio y referencedColumnName la columna de subcategoria
    private SubCategoria subCategoria;


    //no hace falta pasar el fecha_alta en el constructor, ya que se genera automaticamente, así como el id
    public HabilidadServicio(Tipo tipo, String descripcion, Usuario usuario, SubCategoria subCategoria){
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.usuario = usuario;
        this.subCategoria = subCategoria;
    }

    public HabilidadServicio(){
    }

    public long getId_habilidad() {
        return id_habilidad;
    }

    public void setId_habilidad(long id_habilidad) {
        this.id_habilidad = id_habilidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(LocalDateTime fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public SubCategoria getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(SubCategoria subCategoria) {
        this.subCategoria = subCategoria;
    }
}
