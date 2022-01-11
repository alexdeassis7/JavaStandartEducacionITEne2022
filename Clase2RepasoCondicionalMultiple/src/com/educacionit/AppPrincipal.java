package com.educacionit;

import java.util.Scanner;

//Enunciado : Desarrollar un algoritmo que permita ingresar un número entero comprendido entre 1 y 7 , y que 
//muestre por pantalla el dia de la semana al que se corresponde 
public class AppPrincipal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numeroingresado = 0;

		do {
			System.out.println("ingrese un numero comprendido entre 1 y 7");
			numeroingresado = teclado.nextInt();
			if (numeroingresado < 1 || numeroingresado > 7) {
				System.out.println(
						"el numero ingresado no se encuentra dentro del rango especificado , intenta de nuevo ");
			}
		} while (numeroingresado < 1 || numeroingresado > 7);

		// condicional multiple (switch)
		switch (numeroingresado) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Martes");
			break;
		case 4:
			System.out.println("Miercoles");
			break;
		case 5:
			System.out.println("Jueves");
			break;
		case 6:
			System.out.println("Viernes");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		}

		System.out.println("Fin de la App");

		teclado.close();
	}

}
