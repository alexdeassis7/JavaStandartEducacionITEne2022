package com.educacionit;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Persona[] personas;
		int cantPersonas;

		System.out.println("cuantas personas cargara en el sistema?");
		cantPersonas = teclado.nextInt();
		personas = new Persona[cantPersonas];

		for (int i = 0; i < personas.length; i++) {

			Persona p1 = new Persona();
			Documento d1 = new Documento();

			System.out.println("Ingrese nombre de la persona " + (i + 1));
			p1.setNombre(teclado.next());

			System.out.println("Ingrese apellido de la persona " + (i + 1));
			p1.setApellido(teclado.next());

			System.out.println("Ingrese tipo de documento de la persona " + (i + 1));
			d1.setTipodocumento(teclado.next());

			System.out.println("Ingrese numero documento de la persona " + (i + 1));
			d1.setNumeroDocumento(teclado.nextInt());

			p1.setDocumento(d1);

			System.out.println("seteamos la edad automaticamente");
			p1.setEdad(p1.asignarEdad());

			personas[i] = p1;

		}

		for (int i = 0; i < personas.length; i++) {
			System.out.println(personas[i].toString());
		}

		teclado.close();
	}

}
