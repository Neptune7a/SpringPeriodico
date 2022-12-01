package com.crud.demo.modelo;

import java.security.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Noticia {
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titulo;
	private String contenido;
    private Timestamp fecha;
	private String Estado;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
        name = "noticia_categoria",
        joinColumns = @JoinColumn(name = "id_noticia", nullable = false),
        inverseJoinColumns = @JoinColumn(name="id_categoria", nullable = false)
    )
    private List<Category> Category;


	@ManyToOne
	@JoinColumn(name="id_usuario")
	Usuario usuario;

	@ManyToOne
	@JoinColumn(name="id_comentario")
	Comentario comentario;


	public Noticia(int id, String titulo, String contenido, Timestamp fecha, String estado,
			List<com.crud.demo.modelo.Category> category, Usuario usuario, Comentario comentario) {
		this.id = id;
		this.titulo = titulo;
		this.contenido = contenido;
		this.fecha = fecha;
		Estado = estado;
		Category = category;
		this.usuario = usuario;
		this.comentario = comentario;
	}

	public Noticia() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
}
