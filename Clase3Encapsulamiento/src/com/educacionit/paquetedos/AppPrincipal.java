package com.educacionit.paquetedos;

import com.educacionit.Persona;

public class AppPrincipal {

	public static void main(String[] args) {
		Persona p1 = new Persona("Alex", "De assis" , -27);
	

		// Error no se puede acceder directamente a atributos privados
//		p1.nombre = "Alex";
//		p1.edad = -27;
//		p1.apellido = "De Assis";

		// accedo a los atributos mediante el metodos seters
		System.out.println(p1.getNombre());
		System.out.println(p1.getApellido());
		System.out.println(p1.getEdad());

		//modifico el estado de los atributos mediante el metodo setters
//		p1.setEdad(-27);
//		p1.setNombre("Alex");
//		p1.setApellido("De Assis");
//		
		System.out.println(p1.toString());
	}

}
