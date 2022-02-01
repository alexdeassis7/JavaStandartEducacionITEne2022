package com.educacionit.modelos;

public class Profesor extends Persona {

	private Float pago;

	public Profesor(Float pago, Integer id, String nombre, String apellido, Byte edad, Documento documento) {
		super(id, nombre, apellido, edad, documento); // invoco al constructor de la clase padre
		this.pago = pago;
	}

	@Override
	public String toString() {
		return "Profesor [pago=" + pago + ", toString()=" + super.toString() + "]";
	}

	public Float getPago() {
		return pago;
	}

	public void setPago(Float pago) {
		this.pago = pago;
	}
	
	@Override
	public void guardar() {

		System.out.println("se guardo exitosamente el Profesor en la base de datos");
	}

	@Override
	public void eliminar() {
		System.out.println("se BORRO exitosamente el Profesor en la base de datos");
		
	}

	@Override
	public void modificar() {
		System.out.println("se MODIFICO exitosamente el Profesor en la base de datos");
		
	}


}
