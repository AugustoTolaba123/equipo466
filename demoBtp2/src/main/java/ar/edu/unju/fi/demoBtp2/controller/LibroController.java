package ar.edu.unju.fi.demoBtp2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.fi.demoBtp2.model.Libro;
import ar.edu.unju.fi.demoBtp2.service.ILibroService;

@Controller
public class LibroController {
  @Autowired
  private ILibroService libroService;
  
	
	@Autowired
	private Libro libro;
	@GetMapping("/libro")
	public String getLibroPage(Model model){
		model.addAttribute(libro);
	   return "libro";	
	
	}
	
	@PostMapping("/libro/guardar")
	public String agregarLibro(@ModelAttribute("libro")Libro libro) {
		 libroService.agregarLibro(libro);
		 return "resultado";
		
	}
	
	
}
