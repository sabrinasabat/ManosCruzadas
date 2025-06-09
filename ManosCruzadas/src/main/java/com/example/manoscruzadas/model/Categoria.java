package com.example.manoscruzadas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria")

public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Genera automaticamente el valor de ID
    @Column(name = "id_categoria")
    private long idCategoria;

    @Column(name = "nombre")
    private String nombre;

    public Categoria(String nombre){
        this.nombre = nombre;
    }

    public Categoria(){

    }

    public long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(long id_categoria) {
        this.idCategoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
