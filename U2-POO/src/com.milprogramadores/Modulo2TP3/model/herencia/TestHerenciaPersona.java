package com.milprogramadores.Modulo2TP3.model.herencia;

import java.util.ArrayList;

public class TestHerenciaPersona {

	public static void main(String[] args) {
		ArrayList<Persona> planilla = new ArrayList<>();
		for(int i=0;i<5;i++) {
			planilla.add(new Profesor("Profesor "+i, Integer.toString(i), Integer.toString(i),valorDouble(), 20*i+100, "Materia "+i, i));
			planilla.add(new Alumno("Alumno "+i, Integer.toString(i), Integer.toString(i), valorDouble(), i*20+100, i, "carrera "+i));
		}
		
		planilla.forEach(System.out::println);
	}
	
	private static double valorDouble() {
		return 50+(double)Math.round(Math.random()*5000)/100;
	}

}
