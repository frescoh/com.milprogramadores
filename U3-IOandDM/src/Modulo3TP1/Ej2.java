package Modulo3TP1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej2 {
	/* Escribe un programa que solicite al usuario un valor entero. El programa no
	   dejará de solicitarlo hasta que el método introduzca un valor entero (usar: flujo de bytes). 
	 */

	public static void main(String[] args) {
		// throws delega la responsabilidad del manejo del error a quien llame a esta funcion
		
		/**
		 * Con buffer de entrada (Mas eficiente)
		 */
		/*
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(isr);
		buffer.read();
		*/
		try {
			int valor;
			do {
				System.out.print("Ingrese un valor entero: ");
				valor = System.in.read();
			System.out.println(valor+"\t"+(char)valor);
			}while(valor<48 || valor>57);
			System.out.println("Ingreso correcto");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
