package com.milprogramadores.Modulo2TP3.model.herencia;

import java.util.ArrayList;

public class TestHerenciaColectivos {

	public static void main(String[] args) {
		
		ArrayList<Colectivo> flota = new ArrayList<>();
		for(int i=0;i<5;i++) {
			flota.add(new ColectivoMedia(i, "Empresa "+i, "Chofer "+i, "Marca "+i, "Modelo "+i));
			flota.add(new ColectivoLarga(i, "Empresa "+i, "Chofer "+i, "Marca "+i, "Modelo "+i,peso()));
		}
		
		flota.forEach(System.out::println);
	}
	
	private static double peso() {
		return (double)Math.round(Math.random()*500100)/100;
	}

}
