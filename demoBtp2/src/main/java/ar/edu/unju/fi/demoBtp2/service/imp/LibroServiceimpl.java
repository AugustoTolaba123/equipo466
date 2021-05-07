package ar.edu.unju.fi.demoBtp2.service.imp;


import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;



import ar.edu.unju.fi.demoBtp2.model.Libro;
import ar.edu.unju.fi.demoBtp2.service.ILibroService;


@Service
public class LibroServiceimpl implements ILibroService {
	
	private static final Log LOGGER = LogFactory.getLog(LibroServiceimpl.class);
	
	private List<Libro> librosList= new ArrayList<Libro>();
	
	@Override
	public void agregarLibro(Libro libro){
	 //agrego el objeto libro en la lista de libros
		librosList.add(libro);
	     LOGGER.info("METHOD: agregarLibro -se agrego un objeto libro en la lista ->"+librosList.get(librosList.size()-1));	
	}

}
