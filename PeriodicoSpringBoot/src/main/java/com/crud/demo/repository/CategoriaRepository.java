package com.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.demo.modelo.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
