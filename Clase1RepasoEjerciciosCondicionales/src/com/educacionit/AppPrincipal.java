package com.educacionit;

import java.util.Scanner;

//3) Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:

//Si trabaja 40 horas o menos se le paga $16 por cada hora.
//Si trabaja más de 40 horas  se le paga $16 por cada una de las primeras 40 horas 
//y $20 por cada hora extra.

public class AppPrincipal {

	public static void main(String[] args) {
//		variables de trabajo 
		int hsTrabajadas = 0, hsExtras = 0, salarioSemanal = 0, hsBase = 40, precioHsBase = 16, precioHsExtra = 20;

		Scanner teclado = new Scanner(System.in);

		// que entra a mi app ?
		System.out.println("Ingrese por favor las cantidad de horas que trabajo esta semana");
		hsTrabajadas = teclado.nextInt();

		// que procesa mi app ?
		if (hsTrabajadas > hsBase) {
			// cuerpo del if
			hsExtras = hsTrabajadas - hsBase;
			salarioSemanal = hsExtras * precioHsExtra + hsBase * precioHsBase;
		} else {
			salarioSemanal = hsTrabajadas * precioHsBase;
		}

		// que sale de mi app ?
		System.out.println("Su salario semanal sera de : " + salarioSemanal + " pesos");

		teclado.close();

	}

}
