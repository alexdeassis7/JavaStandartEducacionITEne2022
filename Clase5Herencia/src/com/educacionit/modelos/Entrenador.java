package com.educacionit.modelos;

//clases hijas de la clase SeleccionFutbol
public class Entrenador extends SeleccionFutbol {

	private String idFederacion;


	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellido, int edad) {
		super(id, nombre, apellido, edad);
		this.idFederacion = idFederacion;
	}

	public void concentrarse() {
	}

	public void viajar() {
	}

	public void dirigirPartido() {
	}

	public void dirigirEntrenamieto() {
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

}
