package com.milprogramadores.clase1y2;

public class NumerosEnteros {
	private int valor;
	
	public NumerosEnteros(int valor) {
		
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int suma(NumerosEnteros numero) {
		return this.valor+numero.getValor();
	}
	
	public int resta(NumerosEnteros numero) {
		return this.valor-numero.getValor();
	}
	
	public int multiplicacion(NumerosEnteros numero) {
		return this.valor*numero.getValor();
	}
	
	public double division(NumerosEnteros numero) {
		if(numero.getValor()!=0) {
			return (double) (this.valor/numero.getValor());
		}
			
		else
			return 0;
	}

}
