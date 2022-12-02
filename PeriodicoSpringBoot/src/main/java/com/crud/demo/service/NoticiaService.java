package com.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.crud.demo.modelo.Category;
import com.crud.demo.modelo.Noticia;
import com.crud.demo.modeloDAO.ICategoryService;
import com.crud.demo.modeloDAO.INoticia;
import com.crud.demo.serviceInterface.INoticiaService;

@Service
public class NoticiaService implements INoticiaService {

	@Autowired
	private INoticia dao;
	private ICategoryService daoc;

	@Override
	public List<Noticia> listar() {
		return (List<Noticia>) dao.findAll();
	}

	@Override
	public Optional<Noticia> listarId(int id) {
		return dao.findById(id);
	}

	@Override
	public int save(Noticia p) {
		int res = 0;
		Noticia per = dao.save(p);
		if (!per.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);

	}
	@Override
	public List<Noticia> listarPorCategoria(@PathVariable String nombreCategoria) {
		return daoc.findByCategoria(nombreCategoria);
	}
}
