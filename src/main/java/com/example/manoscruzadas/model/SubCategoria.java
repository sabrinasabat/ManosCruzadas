package com.example.manoscruzadas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "subcategoria")

public class SubCategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Genera automaticamente el valor de ID
    private long id_subcategoria;

    @Column(name = "nombre")
    private String nombre;


    //https://www.baeldung.com/jpa-join-column
    @ManyToOne //relacion de muchos a uno, así como tenemos en la ddbb
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria") //JoinColumn especifica la columna de subcategoria y referencedColumnName la columna de categoria
    private Categoria categoria;

    public SubCategoria(String nombre, Categoria categoria){
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public SubCategoria(){

    }

    public long getId_subcategoria() {
        return id_subcategoria;
    }

    public void setId_subcategoria(long id_subcategoria) {
        this.id_subcategoria = id_subcategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
