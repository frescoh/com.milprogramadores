package com.milprogramadores.Modulo2TP3.model.herencia;

import java.util.ArrayList;

public class TestHerenciaPerros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Perro> jauria = new ArrayList<>();
		for(int i=0;i<5;i++) {
			jauria.add(new Salchicha(i, "Sanchicha"+i, i, "Negro", peso()));
			jauria.add(new Caniche(i, "Caniche"+i, i, "Negro", peso()));
		}
		
		jauria.forEach(System.out::println);

	}
	
	private static double peso() {
		return (double)Math.round(Math.random()*2100)/100;
	}

}
