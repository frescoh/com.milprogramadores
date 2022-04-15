/*									Ejercicio N° 1 	
 * Crear una clase llamada Persona con los atributos: Nombre, Apellido, DNI, Domicilio.
 * Con los métodos: Constructor y un método que permita mostrar la información de la persona.
*/

package com.milprogramadores.Modulo2TP1;

public class Persona {
	private String nombre;
	private String apellido;
	private String dni;
	private String domicilio;
	
	public Persona(String nombre,String apellido,String dni,String domicilio) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni =dni;
		this.domicilio=domicilio;
	}
	
	public Persona(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
		
	}
	
	public String toString() {
		return "Nombre: "+this.nombre+
				"\nApellido: "+this.apellido+
				"\nDNI: "+this.dni+
				"\nDomicilio: "+this.domicilio;
	}
	

}
