package Teoria;

import java.io.IOException;

public class EntradaSystemIn {

	public static void main(String[] args) {
		int caracter = 0;
		/**
		 * Lee la entrada, byte a byte hasta vaciar el buffer
		 */
		try {
			/**
			 * -1 error de lectura y escapa por el catch
			 */
			while((caracter = System.in.read()) !='\n' ) {
				System.out.print(caracter+"\t");
				System.out.println((char) caracter);
			}
			System.out.println("Afuera del while");
			System.out.print(caracter+"\t");
			System.out.println((char) caracter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}