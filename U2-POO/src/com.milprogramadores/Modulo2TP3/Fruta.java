package com.milprogramadores.Modulo2TP3;

public abstract class Fruta {
	private double peso;
	
	public Fruta(double Peso) {
		this.setPeso(Peso);
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public abstract double hacerJugo();

}
