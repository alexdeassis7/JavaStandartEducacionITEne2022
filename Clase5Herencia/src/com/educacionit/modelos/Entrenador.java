package com.educacionit.modelos;

//clases hijas de la clase SeleccionFutbol
public class Entrenador extends SeleccionFutbol {

	private String idFederacion;


	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellido, int edad , String idFederacion) {
		super(id, nombre, apellido, edad);
		this.idFederacion = idFederacion;
	}

	public void dirigirPartido() {
		System.out.println("clase Entrenador :  dirigirPartido () ");
	}

	public void dirigirEntrenamieto() {
		System.out.println("clase Entrenador :  dirigirEntrenamiento () ");
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	// implemente el medoto toString de la clase Object , osea le di un comportamiento
	public String toString() {
		return "Entrenador [idFederacion=" + idFederacion + ", id=" + id + ", nombre=" + nombre + ", apellido="
				+ apellido + ", edad=" + edad + "]";
	}

	
}
