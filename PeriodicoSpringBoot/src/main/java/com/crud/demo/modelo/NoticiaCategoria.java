package com.crud.demo.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="noticia_categoria")
public class NoticiaCategoria implements Serializable {
	@Id
	@ManyToOne
	@JoinColumn(name="id")
	private Noticia noticia;
	@Id
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categoria categoria;
	public Noticia getNoticia() {
		return noticia;
	}
	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
	
}
