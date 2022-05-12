package com.milprogramadores.Modulo2TP3;

public class Triangulo extends Figura{
	private double base;
	private double altura;
	private double lado1;
	private double lado2;
	private double lado3;
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
		super();
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	


	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double calcularPerimetro() {
		return lado1+lado2+lado3;
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
