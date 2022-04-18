package com.milprogramadores.Modulo2TP3.model.herencia;

public class Profesor extends Persona{
	private String materia;
	private int horas;
	public Profesor(String nombre, String apellido, String dni, double peso, int altura, String materia, int horas) {
		super(nombre, apellido, dni, peso, altura);
		this.materia = materia;
		this.horas = horas;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	@Override
	public String toString() {
		return "Profesor [Nombre= "+this.getNombre()+", apellido= "+this.getApellido()+", DNI= "+this.getDni()+", materia=" + materia + ", horas=" + horas + "]";
	}
	
	

}
