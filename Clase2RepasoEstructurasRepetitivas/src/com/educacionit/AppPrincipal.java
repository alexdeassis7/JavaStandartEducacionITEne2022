package com.educacionit;

import java.util.Scanner;

//4)	Leer 10 n�meros e imprimir cuantos son positivos , cuantos negativos y cuantos neutros
public class AppPrincipal {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numeroingresado = 0, contadorPositivos = 0, contadorNegativos = 0, contadorNeutros = 0;
		int contador = 1;

		while (contador <= 10) {

			System.out.println("ingrese el numero " + contador + " por favor ");
			numeroingresado = teclado.nextInt();

			if (numeroingresado < 0) {
				contadorNegativos++;
			} else if (numeroingresado > 0) {
				contadorPositivos++;
			} else {
				contadorNeutros++;
			}
			contador++;
		}

		System.out.println("de los 10 numero ingresados ");
		System.out.println(contadorNegativos + " Negativos");
		System.out.println(contadorPositivos + "  Positivos");
		System.out.println(contadorNeutros + "  Neutros");

		teclado.close();

	}
}
