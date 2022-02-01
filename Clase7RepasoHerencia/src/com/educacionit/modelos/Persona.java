package com.educacionit.modelos;

public abstract class Persona implements IDireccionesIP, IPersistencia {
	// atributo de clase
	private static int contador = 0;

	// atributos de instancia
	private Integer id;
	private String nombre;
	private String apellido;
	private Byte edad;
	private Documento documento;

	public Persona(Integer id, String nombre, String apellido, Byte edad, Documento documento) {
		contador++; // incremento la variable estatica para asi ir teneniendo control de la cantidad
					// de personas instanciadas
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.documento = documento;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento="
				+ documento + "]";
	}

	public void mostrarContantesDeLainterface() {
		
		System.out.println(IPBASEDEDATO);
		System.out.println(IPSERVICIODOS);
		System.out.println(IPSERVICIOTRES);
		System.out.println(IPSERVICIOUNO);

	}

	public boolean mayorEdad() {
		return edad >= 18;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Persona.contador = contador;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Byte getEdad() {
		return edad;
	}

	public void setEdad(Byte edad) {
		this.edad = edad;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

}
