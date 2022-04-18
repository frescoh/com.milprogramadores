package com.milprogramadores.Modulo2TP3;

public class Pera extends Fruta{
	
	public Pera(double Peso) {
		super(Peso);
		// TODO Auto-generated constructor stub
	}

	public double hacerJugo() {
		return this.getPeso()*0.6;
	}

}
