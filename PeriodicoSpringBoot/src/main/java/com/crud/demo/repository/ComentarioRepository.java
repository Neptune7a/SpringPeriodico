package com.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.demo.modelo.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Integer> {

}
