package Modulo3TP1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej5 {
	/*Ejercicio Nro 5
		Crear un fichero de texto con el nombre y contenido que tú desees. Por
		ejemplo, Ejercicio1.txt. Realiza un programa en Java que lea el fichero
		<<Ejercicio1.txt>> carácter a carácter y muestre su contenido por pantalla sin
		espacios.
		
		Ejemplo:
		Si el fichero contiene el siguiente texto “Hola que haces”, deberá mostrar
		“Holaquehaces”.
		
		sugerencia: usar la función ready() de BufferedReader (implementarla para saber lo
		que hace)
	 */

	public static void main(String[] args) {
		
		
		File directorio = new File("./src/resources");
		if(!directorio.exists()) {
			crearDirectorio("./src/resources");
		}
		String nombreArchivo = "Ejercicio1.txt";
		File archivo = crearArchivo("./src/resources", nombreArchivo);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el texto que desea guardar en el archivo: ");
		String escribir = scanner.nextLine();
		scanner.close();
		if(archivo != null) {
			System.out.println("El archivo no existia, pero lo acabamos de crear 😏");
			escribir(archivo, escribir);
			leerSinEspacios(archivo);
		}else {
			archivo = new File(directorio,nombreArchivo);
			if(archivo.exists())
				System.out.println("El archivo ya existia. Pero lo sobreescribo porque si\n");
			escribir(archivo, escribir);
		}
		System.out.println("Ahora sin espacios: ");
		leerSinEspacios(archivo);
		
		
			
		
		

	}
	
	public static File crearArchivo(String path,String nombre) {
		File nuevoArchivo = new File(path, nombre);
	
			try {
				if(!nuevoArchivo.exists()) {
					nuevoArchivo.createNewFile();
					return nuevoArchivo;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("No se pudo crear el archivo, "+e.getLocalizedMessage());
			}
			return null;
	}
	
	public static boolean  crearDirectorio(String path) {
		File nuevoDirectorio = new File(path);
		return nuevoDirectorio.mkdir();
	}
	
	public static void escribir(File archivo, String info) {
		FileWriter fw = null;
		BufferedWriter buffer = null;
		
		try {
			fw = new FileWriter(archivo);
			buffer = new BufferedWriter(fw);
			buffer.write(info);
			buffer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se pudo escribir el archivo, "+e.getLocalizedMessage());
			try {
				fw.close();
				buffer.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}
	
	public static void leerSinEspacios(File archivo) {
		FileReader fr = null;
		
		try {
			fr = new FileReader(archivo);
			if(fr.ready()) {
				int caracter;
				while((caracter = fr.read())>-1) { //lee byte a byte, no usamos buffer, pero se podria optimizar usandolo
					if(caracter!=32)
						System.out.print((char)caracter);
					
				}
			}
		} catch (IOException e) {
			System.out.println("Hubo un error al leer el archivo, "+e.getLocalizedMessage());
		}
	}

}
