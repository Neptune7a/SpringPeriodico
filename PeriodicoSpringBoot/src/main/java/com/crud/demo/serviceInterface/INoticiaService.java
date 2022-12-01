package com.crud.demo.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.crud.demo.modelo.Noticia;

public interface INoticiaService {
	public List<Noticia> listar();

	public Optional<Noticia> listarId(int id);

	public int save(Noticia p);

	public void delete(int id);
}
