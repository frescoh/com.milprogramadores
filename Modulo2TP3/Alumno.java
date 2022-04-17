package com.milprogramadores.Modulo2TP3;
import com.milprogramadores.Modulo2TP1.Persona;

public class Alumno extends Persona{
	private int notas[] = new int[3];

	public Alumno(String nombre, String apellido, String dni, String domicilio) {
		super(nombre, apellido, dni, domicilio);
	}
	
	public void generar_notas(int minima, int maxima) {
		for(int i=0;i<3;i++)
			notas[i]=minima+(int)( Math.random()*(maxima+1-minima));
	}
	
	public void generar_notas() {
		for(int i=0;i<3;i++)
			this.notas[i]=(int)( Math.random()*11);
	}
	
	public void mostrar_notas() {
		System.out.println("Materia   \tNota");
		System.out.println("Matematica\t"+this.notas[0]);
		System.out.println("Lengua    \t"+this.notas[1]);
		System.out.println("Historia  \t"+this.notas[2]);
	}
	
	


}

