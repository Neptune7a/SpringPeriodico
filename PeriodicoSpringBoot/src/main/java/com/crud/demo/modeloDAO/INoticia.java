package com.crud.demo.modeloDAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.modelo.Noticia;

@Repository
public interface INoticia extends CrudRepository<Noticia, Integer>{

}
