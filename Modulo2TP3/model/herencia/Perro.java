package com.milprogramadores.Modulo2TP3.model.herencia;

public class Perro {
	private int id;
	private String nombre;
	private int edad;
	private String color;
	private double peso;
	public Perro(int id, String nombre, int edad, String color, double peso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.color = color;
		this.peso = peso;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Perro [id=" + id +", raza= "+this.getClass().getSimpleName()+ ", nombre=" + nombre + ", edad=" + edad + ", color=" + color + ", peso=" + peso
				+ "]";
	}

	
	
	
	

}
