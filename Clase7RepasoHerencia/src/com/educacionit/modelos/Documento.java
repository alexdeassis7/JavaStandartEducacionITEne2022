package com.educacionit.modelos;

//con final "SELLAMOS" la clase para que no sea heredable 
public final class Documento {

	private String tipoDocumento;
	private int numeroDocumento;

	public Documento() {
	}

	public Documento(String tipoDocumento, int numeroDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	@Override
	public String toString() {
		return "Documento [tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + "]";
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

}
