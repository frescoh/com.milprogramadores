package Modulo3TP1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ej6 {

	public static void main(String[] args) {
		String nombre = "numNaturales.txt";
		File ruta = new File("./src/resources/");
		File archivo = crearArchivo(ruta.toString(), nombre,true);
		if(archivo==null) {
			System.out.println("El archivo ya habia sido creado con anterioridad. Se abrirá para sobreescribirlo");
			archivo = new File(ruta,nombre);
		}
		String numeros=null;
		for(int i=0;i<10;i++) {
			numeros= "";
			for(int j=1;j<10;j++) {
				numeros += 10*i+j+"\t ";
			}
			if(i!=9)
				numeros += 10*i+10+"\n";
			else
				numeros += 10*i+10;
			escribir(archivo,numeros);
		}
		System.out.println("Numeros cargados en el archivo");
		System.out.println("FIN");

	}
	
	public static File crearArchivo(String ruta, String nombre,boolean sobreescribir) {
		File archivo = new File(ruta,nombre);
		try {
			if(!archivo.exists()) {
				archivo.createNewFile();
				System.out.println("Archivo nuevo creado");
				return archivo;
			}else {
				if(sobreescribir) {
					archivo.delete();
					System.out.println("Archivo existia, fue eliminado");
					archivo.createNewFile();
					System.out.println("Se creó un archivo nuevo");
					return archivo;
				}
			}
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void escribir(File archivo, String texto) {
		FileWriter fw = null;		
		try {
			fw = new FileWriter(archivo,true); //true permite agregar registros al archivo
			
			fw.write(texto);
		} catch (IOException e) {
			System.out.println("Error, no se pudo escribir el archivo, "+e.getLocalizedMessage());
		}finally {
			try {
				//buffer.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
