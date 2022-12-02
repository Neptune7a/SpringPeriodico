package com.crud.demo.modeloDAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.demo.modelo.Category;
import com.crud.demo.modelo.Noticia;

public interface ICategoryService extends JpaRepository<Noticia, Integer> {

    List<Noticia> findByCategoria(String nombreCategoria);
    
    
}
