package com.educacionit.programa;

import java.util.ArrayList;

import com.educacionit.modelos.Entrenador;
import com.educacionit.modelos.Futbolista;
import com.educacionit.modelos.Masajista;
import com.educacionit.modelos.SeleccionFutbol;

public class Main {

	// ArrayList de objetos SeleccionFutbol. Independientemente de la clase hija a
	// la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {

		// creamos una instancia de cada una de las clases hijas
		Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 62, "29ES48");
		Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		Masajista raulMartinez = new Masajista(3, "Raul", "Martinez", 42, "Licenciado en Musculatura", 12);

		// agregamos todos los objetos al ArrayList de SeleccionFutbol
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// CONCENTRARSE
		System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo metodo)");

		for (SeleccionFutbol integranteAux : integrantes) {
			System.out.println(integranteAux.getNombre() + " " + integranteAux.getApellido());
			integranteAux.concentrarse();
		}

		// VIAJAR
		System.out.println("Todos los integrantes viajaron a jugar un partido . (Todos ejecutan el mismo metodo)");

		for (SeleccionFutbol integranteAux : integrantes) {// for each
			System.out.println(integranteAux.getNombre() + " " + integranteAux.getApellido());
			integranteAux.viajar();
		}
		// for comun
//		for (int i = 0; i < args.length; i++) {}
		// for each
//        for (String string : args) {    }

		// ejecutamos el codigo especifico de las clases hijas ,aqui no podemos utilizar
		// el for each para recorrer
		// el array list

		// ENTRENAMIENTO
		System.out.println("Entrenamiento : Solamente el entrendor y el futbolista tienen metodos para entrenar");
		System.out.println(delBosque.getNombre() + " " + delBosque.getApellido());
		delBosque.dirigirEntrenamieto();
		System.out.println(iniesta.getNombre() + " " + iniesta.getApellido());
		iniesta.entrenar();

		// MASAJE
		System.out.println("Masaje : Solamente el masajista tiene el metodo para dar un masaje");
		System.out.println(raulMartinez.getNombre() + " " + raulMartinez.getApellido());
		raulMartinez.darMasaje();

		// PARTIDO FUTBOL
		System.out.println(
				"Partido de Fútbol : Solamente el entrendor y el futbolista tienen metodos para el partido de fútbol");
		System.out.println(delBosque.getNombre() + " " + delBosque.getApellido());
		delBosque.dirigirPartido();
		System.out.println(iniesta.getNombre() + " " + iniesta.getApellido());
		iniesta.jugarPartido();
		
		
		//test de toString 
		System.out.println(delBosque.toString()); //implementado en la clase Entrenador 

		
//		float numero = 10 ; 
//		
//		
//		Float numeroObjeto = new Float(numero) ;

		
		System.out.println(iniesta.toString());

	}

}
