/*					Ejercicio N° 2
 * Crear una clase llamada serie con los atributos: titulo, números de temporadas,
 * género y creador. Con los siguientes métodos: Constructor, mostrar todos los
 * atributos, sobrescribir todos los atributos.
 */

package com.milprogramadores.clase1y2;

public class Serie {
	private String titulo;
	private int numTemporada;
	private String genero;
	private Persona creador;
	
	public Serie(String titulo,int numTemporada, String genero,Persona creador) {
		this.titulo=titulo;
		this.numTemporada=numTemporada;
		this.genero=genero;
		this.creador=creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporada() {
		return numTemporada;
	}

	public void setNumTemporada(int numTemporada) {
		this.numTemporada = numTemporada;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Persona getCreador() {
		return creador;
	}

	public void setCreador(Persona creador) {
		this.creador = creador;
	}
	
	

}
