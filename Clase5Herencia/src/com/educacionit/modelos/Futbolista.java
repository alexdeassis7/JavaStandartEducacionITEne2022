package com.educacionit.modelos;

//clases hijas de la clase SeleccionFutbol
public class Futbolista extends SeleccionFutbol {

	private int dorsal;
	private String demarcacion;

	public Futbolista() {
		super();
	}

	public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellido, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	public void jugarPartido() {
		System.out.println("clase Futbolista :  jugarPartido () ");
	}

	public void entrenar() {
		System.out.println("clase Futbolista :  entrenar () ");
	}
	
	public void concentrarse() {
		System.out.println("clase Futbolista :  Concentrarse como lo hace un futbolista  () ");
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

}
