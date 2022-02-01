package com.educacionit.programa;

import java.util.Scanner;

import com.educacionit.modelos.Alumno;
import com.educacionit.modelos.Documento;
import com.educacionit.modelos.Persona;
import com.educacionit.modelos.Profesor;

public class AppPrincipal {

	public static void main(String[] args) {

		// probamos las interfaces (metodo abtractos implementados en la clase hijas y
		// Constantes)

		Profesor profesor = new Profesor(15.2f, 999, "pepe", "rodriguez", (byte) 28, new Documento("DNI", 45789));
		profesor.guardar();
		profesor.modificar();
		profesor.eliminar();
		profesor.mostrarContantesDeLainterface();

		String[] cursos2 = new String[2];
		cursos2[0] = "analisis";
		cursos2[1] = "algebra";
		Alumno alumno = new Alumno(3, "jose", "martinez", (byte) 55, new Documento("DNI", 8888), cursos2);

		alumno.guardar();
		alumno.modificar();
		alumno.eliminar();
		alumno.mostrarContantesDeLainterface();

		Scanner teclado = new Scanner(System.in);

		Alumno[] alumnos;
		int cantidadAlumnos = 0;

		System.out.println("ingrese la cantidad de alumnos que desea cargar");
		cantidadAlumnos = teclado.nextInt();
		alumnos = new Alumno[cantidadAlumnos];

		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("ingrese el Nombre del Alumno [ " + (i + 1) + "]:");
			String nombre = teclado.next();

			System.out.println("ingrese el apellido del Alumno [ " + (i + 1) + "]:");
			String apellido = teclado.next();

			System.out.println("ingrese el Tipo de documento del Alumno [ " + (i + 1) + "]:");
			String tipoDocumento = teclado.next();

			System.out.println("ingrese el numeroDocumento del Alumno [ " + (i + 1) + "]:");
			int numeroDocumento = teclado.nextInt();

			System.out.println("ingrese la Edad del Alumno [ " + (i + 1) + "]:");
			byte edad = teclado.nextByte();

			System.out.println("ingrese la cantidad de cursos del Alumno [ " + (i + 1) + "]:");
			int cantidadCursos = teclado.nextInt();

			String[] cursos = new String[cantidadCursos];
			for (int j = 0; j < cursos.length; j++) {
				System.out.println("ingrese el curso [" + (j + 1) + "]:" + " del Alumno " + nombre);
				cursos[j] = teclado.next();
			}

			alumnos[i] = new Alumno(i, nombre, apellido, edad, new Documento(tipoDocumento, numeroDocumento), cursos);

		}

		Profesor profe = new Profesor(15.2f, 999, "alex", "de assis", (byte) 28, new Documento("DNI", 45789));

		System.out.println("la cantidad de personas creadas es : " + Persona.getContador());

		System.out.println(profe.toString());

		for (int i = 0; i < alumnos.length; i++) {

			System.out.println(alumnos[i].toString());

		}

		teclado.close();

	}

}
