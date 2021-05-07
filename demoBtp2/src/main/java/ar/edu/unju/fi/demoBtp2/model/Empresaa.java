package ar.edu.unju.fi.demoBtp2.model;

import java.time.LocalDate;

public class Empresaa {
	private int codigo;
	private String nombre;
	private LocalDate fechaInicio;
	private String ciudad;
	public Empresaa() {
		super();
	}
	public Empresaa(int codigo, String nombre, LocalDate fechaInicio, String ciudad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.ciudad = ciudad;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
	

}
