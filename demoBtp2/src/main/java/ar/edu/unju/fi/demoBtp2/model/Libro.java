package ar.edu.unju.fi.demoBtp2.model;

import org.springframework.stereotype.Component;

@Component
public class Libro {
	private int codigo;
	private String isbn;
	private String titulo;
	private int cantPaginas;
	private int  anioPublicacion;
	private double precio;
	
	
	public Libro() {
		super();
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getCantPaginas() {
		return cantPaginas;
	}


	public void setCantPaginas(int cantPaginas) {
		this.cantPaginas = cantPaginas;
	}


	public int getAnioPublicacion() {
		return anioPublicacion;
	}


	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", titulo=" + titulo + ", cantPaginas=" + cantPaginas
				+ ", anioPublicacion=" + anioPublicacion + ", precio=" + precio + "]";
	}
	
	
	
	

}
