package com.educacionit.modelos;

//una interface es un conjunto de metodos abstractos 
public interface IPersistencia {

	//lo metodos dentro de una interface son implicitamente Abtract y public 
	void guardar();

	void eliminar();

	void modificar();

}
