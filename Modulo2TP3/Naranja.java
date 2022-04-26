package com.milprogramadores.Modulo2TP3;

public class Naranja extends Fruta {

	public Naranja(double Peso) {
		super(Peso);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double hacerJugo() {
		return this.getPeso()*0.8;
	}

}
