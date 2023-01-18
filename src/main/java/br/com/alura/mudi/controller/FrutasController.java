package br.com.alura.mudi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.alura.mudi.model.Frutas;
import br.com.alura.mudi.repository.FrutasRepository;

@Controller
public class FrutasController {
	
	
	@Autowired
	private FrutasRepository repository;
	
	
	@GetMapping("/frutas")
	public String frutas(Model model) {
		
		 List<Frutas> frutas =  repository.findAll();
		 model.addAttribute("frutas", frutas);
		 
		 return "frutas";
	}

}
