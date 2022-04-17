package com.milprogramadores.Modulo2TP3;


public class Cuadrado extends Figura{
	private double lado;

	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}
	
	@Override
	public double area() {
		return Math.pow(this.lado,2);
	}
	
	@Override
	public String toString() {
		return "Cuadrado.\tLado= "+this.lado+"\tSuperficie= "+(double)Math.round(this.area()*100)/100;
	}

}
