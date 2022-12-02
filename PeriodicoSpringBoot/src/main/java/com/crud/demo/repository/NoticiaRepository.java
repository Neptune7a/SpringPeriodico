package com.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.demo.modelo.Noticia;

public interface NoticiaRepository extends JpaRepository<Noticia, Integer> {


}
