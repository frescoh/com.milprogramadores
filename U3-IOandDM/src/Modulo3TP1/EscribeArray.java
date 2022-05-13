package Modulo3TP1;

import java.io.ByteArrayInputStream;

public class EscribeArray {

	public static void main(String[] args) {
		
		/**
		 * Intenta escribir un programa, de nombre “EscribeArray”, que cree un array de
		 * bytes, con los dígitos del 0 al 9, y a continuación, defina sobre él un flujo de entrada
		 * para leer sus valores, y mostrarlos por pantalla (usar: ByteArrayInputStream y
		 * función available()).
		 * Ejemplo:
		 * Entrada: array_1 = [0,1,2,3,4,5,6,7,8,9]
  		 * Salida = 0,1,2,3,4,5,6,7,8,9
		 */
		
		/**
		 * Aqui se crea el array de bytes
		 */
		byte array[]= {0,1,2,3,4,5,6,7,8,9};
		
		/**
		 * Flujo de entrada para leer los valores del array
		 */
		ByteArrayInputStream bais= new ByteArrayInputStream(array);
		//bais.available(); 	// Devuelve la cantidad de bytes disponbibles para leer
		//bais.read(); 		// Devuelve el byte actual y avanza al siguiente 
		
		/**
		 * Se muestra por pantalla
		 */
		while(bais.available()>1) {
			System.out.print(bais.read()+" , ");
		}
		System.out.println(bais.read()); // Solo para no dejar una coma suelta al final
		System.out.println("Fin");
		
		/*
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
		*/
	}

}
