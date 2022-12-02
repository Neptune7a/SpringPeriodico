package com.crud.demo.modelo;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


@Data
@Entity
@Table(name="noticia")
public class Noticia implements Serializable{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String contenido;
	private Integer categoria;
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	private String estado;
	private String url_imagen;
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
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



	public Integer getCategoria() {
		return categoria;
	}



	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}



	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public String getUrl_imagen() {
		return url_imagen;
	}



	public void setUrl_imagen(String url_imagen) {
		this.url_imagen = url_imagen;
	}



	/*@PrePersist
	public void prePersist() {
		this.fecha=new Date();
	}*/

		
}
