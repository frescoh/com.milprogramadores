package com.milprogramadores.Modulo2TP3.model.herencia;

public class Alumno extends Persona{
	private int legajo;
	private String carrera;
	
	public Alumno(String nombre, String apellido, String dni, double peso, int altura, int legajo, String carrera) {
		super(nombre, apellido, dni, peso, altura);
		this.legajo = legajo;
		this.carrera = carrera;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Alumno [legajo=" + legajo + ", carrera=" + carrera + ", nombre=" + getNombre() + ", apellido()="
				+ getApellido() + ", DNI()=" + getDni() + "]";
	}
	
	
	

}
