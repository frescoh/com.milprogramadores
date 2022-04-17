package com.milprogramadores.Modulo2TP3;

public class Circulo extends Figura{
	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	@Override
	public double area() {
		return Math.pow(radio, 2) *3.14;
	}
	
	@Override
	public String toString() {
		return "Circulo.\tRadio= "+this.radio+"\tSuperficie= "+(double)Math.round(this.area()*100)/100;
	}

}
