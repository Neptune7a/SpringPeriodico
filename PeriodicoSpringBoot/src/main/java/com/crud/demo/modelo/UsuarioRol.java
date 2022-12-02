package com.crud.demo.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuario_rol")
public class UsuarioRol implements Serializable {
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	@Id
	@ManyToOne
	@JoinColumn(name="id_rol")
	private Rol rol;
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	
}
