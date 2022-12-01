package com.crud.demo.modelo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreCategoria;

    public Categoria(int id, String nombreCategoria) {
        this.id = id;
        this.nombreCategoria = nombreCategoria;
    }

    public Categoria() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getnombreCategoria() {
        return nombreCategoria;
    }

    public void setnombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

}
