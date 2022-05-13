package Modulo3TP1;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ej4 {
	 /*	Crea un programa para leer caracteres del teclado. Este formula la pregunta
		hasta que se introduzca alguno de los caracteres que constituyen una respuesta
		válida. La condición de cierre es ingresando el carácter ‘s’ o ‘S’.
	 */
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		int op=0;
		
		try {
			do {
				
				System.out.println("Para salir ingrese [s] Cualquier otra letra para seguir en el bucle: ");
				op = isr.read();
				System.out.println(op);
			}while(op != 83 && op!=115);
			
		} catch (IOException e) {
			System.out.println("Error en la lectura, "+e.getLocalizedMessage());
		}
		System.out.println("Lograste escapar. Felicidades! ");

	}

}
