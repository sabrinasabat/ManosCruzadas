package com.example.manoscruzadas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria")

public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Genera automaticamente el valor de ID
    private long id_categoria;

    @Column(name = "nombre")
    private String nombre;

    public Categoria(String nombre){
        this.nombre = nombre;
    }

    public Categoria(){

    }

    public long getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(long id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
