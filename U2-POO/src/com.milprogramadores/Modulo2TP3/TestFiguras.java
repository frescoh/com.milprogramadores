package com.milprogramadores.Modulo2TP3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestFiguras {

	public static void main(String[] args) {
		int cantidad;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de figuras que desea generar: ");
		cantidad = scanner.nextInt();
		scanner.close();
		ArrayList<Figura> figuras = new ArrayList<>();
		int figura;
		for(int i=0;i<cantidad;i++) {
			figura= (int)(Math.random()*3);
			switch(figura) {
			case 0:
				figuras.add(new Cuadrado(valor()));
				break;
			case 1:
				figuras.add(new Triangulo(valor(),valor()));
				break;
			case 2:
				figuras.add(new Circulo(valor()));				
			}
		}
		figuras.forEach((o) -> System.out.println(o));
		
	}
	
	private static double valor() {
		return (double)Math.round((Math.random()*10100))/100;
	}

}
