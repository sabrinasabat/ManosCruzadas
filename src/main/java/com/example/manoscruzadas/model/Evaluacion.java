package com.example.manoscruzadas.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "evaluacion")

public class Evaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Genera automaticamente el valor de ID
    private long id_evaluacion;

    //He adicionado la dependencia de Jakarta Validation en el pom.xml
    //https://hubdaweb.com.br/blog/Utilizando-Java-Bean-Validation-com-Jakarta-Validation-em-um-Projeto-Spring-Boot/?utm_source=chatgpt.com
    @Column(name= "nota")
    @Min(1) //rango de 1 a 5
    @Max(5)
    private int nota;

    @Column(name = "comentario")
    private String comentario;

    @Column(name = "fecha_evaluacion", updatable = false) //no se puede actualizar
    @CreationTimestamp //crea automaticamente la fecha
    private LocalDateTime fecha_evaluacion;

    @ManyToOne //relacion uno a muchos, así como tenemos en la ddbb
    @JoinColumn(name = "id_usuario_evaluador", referencedColumnName = "id_usuario") //JoinColumn especifica la columna de evaluacion y referencedColumnName la columna de usuario
    private Usuario evaluador;

    @ManyToOne
    @JoinColumn(name = "id_usuario_evaluado", referencedColumnName = "id_usuario") //JoinColumn especifica la columna de evaluacion y referencedColumnName la columna de usuario
    private Usuario evaluado;


    //no hace falta pasar el fecha_evaluacion en el constructor, ya que se genera automaticamente, así como el id
    public Evaluacion(int nota, String comentario, Usuario evaluador, Usuario evaluado){
        this.nota = nota;
        this.comentario = comentario;
        this.evaluador = evaluador;
        this.evaluado = evaluado;
    }

    public Evaluacion(){

    }

    public long getId_evaluacion() {
        return id_evaluacion;
    }

    public void setId_evaluacion(long id_evaluacion) {
        this.id_evaluacion = id_evaluacion;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDateTime getFecha_evaluacion() {
        return fecha_evaluacion;
    }

    public void setFecha_evaluacion(LocalDateTime fecha_evaluacion) {
        this.fecha_evaluacion = fecha_evaluacion;
    }

    public Usuario getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(Usuario evaluador) {
        this.evaluador = evaluador;
    }

    public Usuario getEvaluado() {
        return evaluado;
    }

    public void setEvaluado(Usuario evaluado) {
        this.evaluado = evaluado;
    }
}
