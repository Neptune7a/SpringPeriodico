package com.crud.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.modelo.Categoria;
import com.crud.demo.modelo.Noticia;
import com.crud.demo.repository.NoticiaRepository;
@RestController
@RequestMapping
public class NoticiaControler {
	
	@Autowired
	private NoticiaRepository noticiaRepository;

	
	@GetMapping("/noticias")
	public List<Noticia> getNoticiaAll() {

		return noticiaRepository.findAll();
	}
	
	
	

	/*@GetMapping("/{categoria}/noticia")
	
	 List<Noticia> listarPorCategoria(@PathVariable String nombreCategoria) {
		List<Categoria> categoria = categoriaRepository.findByCategoria(nombreCategoria);
		if (!nombreCategoria.isEmpty()) {
			return category.get(0).getNoticias();
		}
		return null;
	}*/
}
