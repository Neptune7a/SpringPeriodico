package com.crud.demo.controler;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.demo.modelo.Noticia;
import com.crud.demo.serviceInterface.INoticiaService;

@Controller
@RequestMapping
public class NoticiaControler {
	
	@Autowired
	private INoticiaService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("noticias", service.listar());
		return "index";
	}
	@GetMapping("/listar/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("noticia", service.listarId(id));
		return "form";
	}
	
	@GetMapping("/new")
	public String nuevo(Model model) {
		model.addAttribute("noticia", new Noticia());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Valid Noticia p,Model model) {
		int id=service.save(p);
		if(id==0) {
			return "form";
		}
		return "redirect:/listar";
	}
	
	@GetMapping("/delete/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/listar";
	}
}
