/*Ejercicio N° 4
 * Crea una clase llamada Contador que contenga un único atributo entero llamado
 * cont. La clase tendrá los siguientes constructores: Constructor por defecto
 * Constructor con parámetros para inicializar el contador con un valor no negativo. Si
 * el valor inicial que se recibe es negativo el contador tomará el valor cero como valor
 * inicial. Constructor copia. Además de los métodos getter y setter, la clase contendrá
 * los métodos: incrementar: incrementa el contador en una unidad. decrementar:
 * decrementa el contador en una unidad. El contador nunca podrá tener un valor
 * negativo. Si al decrementar se alcanza un valor negativo el contador toma el valor cero.

 */
package com.milprogramadores.clase1y2;

public class Contador {
	private  int cont;
	public Contador(int cont) {
		if(cont>0)
			this.cont = cont;
		else 
			this.cont =0;
	}
	
	public Contador() {
		this.cont=0;
	}
	
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public void incrementar()
	{
		this.cont++;
	}
	
	public void decrementar() {
		if(this.cont !=0)
			this.cont--;
	}
}
