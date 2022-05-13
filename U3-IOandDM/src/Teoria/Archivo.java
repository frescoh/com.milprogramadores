package Teoria;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieHandler;

public class Archivo {
	public static void main(String args[]) {

		/**
		 * is va a ser una entreada de datos generica
		 * el origen puede ser: teclado, llamada a sistema, archivo, etc
		 */
		@SuppressWarnings("unused")
		InputStream is=  System.in;  
		
		
		/**
		 * Lee el caracter ingresado en unicode, y lo muestra de esa manera
		 */
		int caracter=0;
		try {
			caracter = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(caracter);
		if(caracter==13)
			System.out.println("usted presionó 'Enter'");
		
	}

}
