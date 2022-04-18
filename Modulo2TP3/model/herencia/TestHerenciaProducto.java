package com.milprogramadores.Modulo2TP3.model.herencia;

import java.util.ArrayList;

public class TestHerenciaProducto {

	public static void main(String[] args) {
		ArrayList<Producto> gondola = new ArrayList<>();
		for(int i=0;i<6;i++) {
			gondola.add(new ProductoLacteo(i, precio(), "Producto"+i, "Fabricante"+i, i+20, porcentajeLeche(),
			i));
			
			gondola.add(new ProductoEnvasado(i, precio(), "Producto"+i, "Fabricante"+i, i+20,"botella"));
		}
		
		gondola.forEach(System.out::println);

	}
	
	private static double precio() {
		return (double)Math.round(Math.random()*20100)/100;
	}
	
	private static int porcentajeLeche() {
		return 50+(int)(Math.random()*51);
	}

}
