package com.milprogramadores.Modulo2TP2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class TestProductos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> catalogo = new ArrayList<Producto>();
        int cantidad;
        System.out.print("Indique la cantidad de productos que desea cargar: ");
        cantidad= scanner.nextInt();
        
        
        //Se carga la lista con la cantidad indicada
        //Solo se require el ingreso de fecha para los productos perecederos
        //Nombre = producto + posicion
        // Precio entre 0 y 100 
        //Se ingresa un producto no perecedero en las posiciones pares y uno perecedero en las impares
        for(int i=0;i<cantidad;i++) {     
        	String nombre = "Producto-"+i;
        	double precio= (double) Math.round(Math.random()*10100)/100;
        	if(i%2==0)
        		catalogo.add(new Producto(nombre, precio));
        	else {
        		nombre = nombre+"-[perecedero]";
        		System.out.print("ingrese la fecha de vencimiento de "+nombre+" con el formato \"dd/mm/aaaa\": ");
        		String fecha = scanner.next();
        		
        		LocalDate vencimiento = LocalDate.parse(fecha,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        		
        		catalogo.add(new ProductoPerecedero(nombre,precio,vencimiento));
        	}        	
    	}
        scanner.close();
        System.out.println();
        //Mostramos los productos:
        for(Producto p: catalogo) {
    		System.out.println(p+"\n");
        }
        
    	// Vamos a comprar 5 productos de cada articulo de la lista
    	double  suma = 0;
    	for(Producto p: catalogo) {
    		suma+= p.calcular(5);
    	}
    	System.out.println((double)Math.round(suma*100)/100);
        
    	
	}

}
