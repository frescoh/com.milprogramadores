/*Ejercicio N° 4
 * 	Crear una clase Productos con atributos: 
 * 		Nombre, 
 * 		precios, 
 * 		vencimiento, 
 * 		con 2 tipos de productos 
 * 			perecederos y 
 * 			no perecederos.
 *  Crear sus constructores getters y setters.
 * 	crear una función llamada calcular: 
 * 		En producto simplemente seria calcular precio por cantidad, 
 * 		en perecederos el precio se reducirá según los días a caducar, 
 * 			si le queda 1 día se reducirá 4 veces el precio, 
 * 			si le quedan 2 días se reducirá el precio 3 veces, 
 * 			si le quedan 3 días se reducirá la mitad el precio. 
 *	Crear una clase ejecutable y 
 *	crear un array de productos y 
 *	muestra el precio total de vender 5 productos de cada uno.
 */

package com.milprogramadores.Modulo2TP2;

public class Producto{
	protected String nombre;
	protected double precio;
	
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio=precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	
	public double calcular(int cantidad) {
		return this.precio*cantidad;
	}
	
	public String toString() {
		return "Producto: "+this.nombre+"\nPrecio: "+this.precio;
	}

}
