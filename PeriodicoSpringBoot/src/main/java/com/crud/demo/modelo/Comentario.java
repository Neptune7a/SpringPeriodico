package com.crud.demo.modelo;

import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String mensaje;
    private String contenido;
    private Timestamp fecha;

    @ManyToOne
	@JoinColumn(name="id_noticia")
	Noticia noticia;

    public Comentario(int id, String mensaje, String contenido, Timestamp fecha) {
        this.id = id;
        this.mensaje = mensaje;
        this.contenido = contenido;
        this.fecha = fecha;
    }

    public Comentario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    // crear la relacion con noticia en id noticia

}
