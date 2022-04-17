package com.milprogramadores.Modulo2TP3;

public class Triangulo extends Figura{
	private double base;
	private double altura;
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double area() {
		return this.base*this.altura/2;
	}
	
	@Override
	public String toString() {
		return "Triangulo.\tBase= "+this.base+"\tAltura= "+this.altura+"\tSuperficie= "+(double)Math.round(this.area()*100)/100;
	}

}
