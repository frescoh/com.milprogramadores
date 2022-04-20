package com.milprogramadores.Modulo2TP3;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestJugo {

	public static void main(String[] args) {
		ArrayList<Fruta> canasta = new ArrayList<>();
		System.out.print("Indique la cantidad de frutas que desea generar: ");
		Scanner scanner = new Scanner(System.in);
		int cantidad = scanner.nextInt();
		for(int i =0;i<cantidad;i++) {
			int fruta = (int)(Math.random()*3);
			switch(fruta) {
				case 0:
					canasta.add(new Manzana(peso()));
					break;
				case 1:
					canasta.add(new Pera(peso()));
					break;
				case 2:
					canasta.add(new Naranja(peso()));
			}
		}
		double sum;
		int i;
        for(sum= 0, i= canasta.size() - 1; 0 <= i; sum+= canasta.get(i--).hacerJugo());
		
		System.out.println("Fruta\tPeso[gr]\tJugo[cc]");
		 
		canasta.forEach(a -> { System.out.println(a.getClass().getSimpleName()+
				"\t"+a.getPeso()+
				"\t\t"+(double)Math.round(a.hacerJugo()*100)/100 );});
		System.out.println("Total de jugo obtenido: "+(double)Math.round(sum*100)/100);
		
		
		/*
		double jugo=0;
		for(Fruta f : canasta) {
			double jugoDeEstaFruta= (double)Math.round(f.hacerJugo()*100)/100;
			jugo +=jugoDeEstaFruta;
			System.out.println(f.getClass().getSimpleName()+"\t"+f.getPeso()+"\t\t"+jugoDeEstaFruta);
		}
		
		System.out.println("Total de jugo obtenido: "+jugo);*/
		scanner.close();
	}
	
	private static double peso() {
		return (double)Math.round(Math.random()*50000)/100;
	}

}
