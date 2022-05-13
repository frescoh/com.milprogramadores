package Modulo3TP1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ej3 {
	/*	Ingresar un número por teclado solicitando el precio de un producto “x”
		(puede tener decimales) y calcule el precio final con IVA. El IVA será una constante
		del 10.5%. Usar InputStreamReader y Scanner.
	 */
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String precio;
		do {
			System.out.print("Ingrese un precio: ");
			precio = scanner.nextLine();
			System.out.println();
		
		}while(!esDouble(precio));
		System.out.println("el precio final es: "+Double.valueOf(precio)*1.105);
		
		
		
		System.out.println("Ahora con InputStreamReader");
		InputStreamReader isr = new InputStreamReader(System.in); 	//Lee byte a byte
		BufferedReader buffer = new BufferedReader(isr);			//Lee la entrada completa
		String precioBSR=null;	
		try {
			do {
				System.out.println("Ingrese un precio nuevamente: ");
				precioBSR = buffer.readLine();
			}while(!esDouble(precioBSR));
		} catch (IOException e) {
			System.out.println("error en la lectura, "+e.getLocalizedMessage());
		}finally {
			try {
				buffer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("el precio final es: "+Double.valueOf(precioBSR)*1.105);
		scanner.close();
	}
	
	public static boolean esDouble(String valor) {
		int comas =0;
		int i = 0;
		while(i<valor.length() && comas<=1) {
			if(valor.charAt(i)==',')
				comas++;
			int asciiValue =valor.charAt(i);
			if(asciiValue <48 || asciiValue> 57 && asciiValue!=44)// controla que solo se hayan ingresado digitos del 0 al 9 o una coma
				break;
			i++;
		}
		if(i==valor.length()&& valor.charAt(valor.length()-1)!=',')
			return true;
		else
			return false;
	}
}
