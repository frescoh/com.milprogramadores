package com.milprogramadores.Modulo2TP3;

public class TestAnimal {

	public static void main(String[] args) {
		Animal unAnimal = new Perro();
		System.out.println(unAnimal.gritar());
		
		unAnimal = new Gato();
		System.out.println(unAnimal.gritar());
		
		unAnimal = new Gallo();
		System.out.println(unAnimal.gritar());
		
	}

}
