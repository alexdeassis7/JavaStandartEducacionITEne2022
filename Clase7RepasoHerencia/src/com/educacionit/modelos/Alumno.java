package com.educacionit.modelos;

import java.util.Arrays;

public class Alumno extends Persona {

	private String[] cursos;

	public Alumno(Integer id, String nombre, String apellido, Byte edad, Documento documento, String[] cursos) {
		super(id, nombre, apellido, edad, documento);
		this.cursos = cursos;
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Alumno [cursos=" + Arrays.toString(cursos) + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void guardar() {

		System.out.println("se guardo exitosamente el alumno en la base de datos");
	}

	@Override
	public void eliminar() {
		System.out.println("se BORRO exitosamente el alumno en la base de datos");
		
	}

	@Override
	public void modificar() {
		System.out.println("se MODIFICO exitosamente el alumno en la base de datos");
		
	}


}
