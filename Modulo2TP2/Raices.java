package com.milprogramadores.Modulo2TP2;

public class Raices {
	private int a,b,c;
	
	public Raices(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	private void obtenerRaices() {
		if(this.tieneRaices()) {
			double r1= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
			double r2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
			System.out.println("las raices de la ecuacion son: r1="+r1+" r2="+r2);
		}
		else
			System.out.println("La ecuacion no tiene solucion doble");
	}
	
	public void calcular() {
		if(!this.tieneRaices()) {
			this.obtenerRaices();
		}
		else 
			if(this.tieneRaiz())
				this.obtenerRaiz();
			else
				System.out.println("La ecuacion no tiene raices en R");
	}
	
	private void obtenerRaiz() {
		if(b*b-4*a*c==0) 
			System.out.println("La ecuacion tiene una unica raiz= "+(-b/(2*a)));
		else
			System.out.println("La ecuacion no tiene una solucion unica");
	}
	
	private double discriminante() {
		return Math.pow(b, 2)-4*a*c;
	}
	
	private boolean tieneRaices() {
		return Math.pow(b, 2)-4*a*c>0;
	}
	
	private boolean tieneRaiz() {
		return Math.pow(b, 2)-4*a*c==0;
	}

}
