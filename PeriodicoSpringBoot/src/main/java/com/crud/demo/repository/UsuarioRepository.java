package com.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.demo.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
