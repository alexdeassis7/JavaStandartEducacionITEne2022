package com.educacionit.modelos;

//clases hijas de la clase SeleccionFutbol
public class Masajista extends SeleccionFutbol {

	private String titulacion;
	private int aniosExperiencia;

	public Masajista() {
		super();
	}

	public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellido, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}

	public void concentrarse() {
	}

	public void viajar() {
	}

	public void darMasaje() {
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

}
