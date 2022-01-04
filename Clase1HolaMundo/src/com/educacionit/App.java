package com.educacionit;

import java.util.Scanner; //agrego libreria Scanner para tomar datos por teclado 

public class App {

	public static void main(String[] args) {
		// atajo para salidas por consola es : "syso" + ctrl + space
		// salvar cambios = ctrl + 's'
		// borrar linea = ctrl + d
		// comentario de linea = ctrl + shift + c
		// para importar librerias = ctrl + shift + 'o'
        //duplicar linea = ctrl + alt + flechaAbajo
		
//		ejercicios secuenciales 
//	         Ej 1 ) Un maestro desea saber que porcentaje de hombres 
//            y que porcentaje de mujeres hay en un grupo de estudiantes

//		variables de trabajo 
		float numHombres = 0, numMujeres = 0, totalAlumnos = 0, porcentajeHombres = 0, porcentajeMujeres = 0;
		Scanner teclado = new Scanner(System.in);

		// que entra a mi app ?
		System.out.println("Ingrese el numero de mujeres");
		numMujeres = teclado.nextFloat();

		System.out.println("Ingrese el numero de hombres");
		numHombres = teclado.nextFloat();

		// que procesa mi app ?
		totalAlumnos = numHombres + numMujeres;
		porcentajeMujeres = numMujeres * 100 / totalAlumnos;
		porcentajeHombres = numHombres * 100 / totalAlumnos;

		// que sale de mi app ?
		System.out.println("------------- Resultados obtenidos -------------");
		System.out.println("Porcentaje Hombres : " + porcentajeHombres);
		System.out.println("Porcentaje Mujeres : " + porcentajeMujeres);

		teclado.close();
		
		//ejercicio secuenciales tarea : 
		
		
	}
}
