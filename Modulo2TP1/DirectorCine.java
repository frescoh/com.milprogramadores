package com.milprogramadores.Modulo2TP1;

public class DirectorCine extends Persona {
	private int edad;
	
	public DirectorCine(String nombre, String apellido, int edad) {
		super(nombre,apellido);
		this.edad=edad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
