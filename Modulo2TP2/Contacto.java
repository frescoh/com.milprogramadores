package com.milprogramadores.Modulo2TP2;

import java.util.Objects;

public class Contacto {
	String nombre;
	String numero;
	
	public Contacto(String nombre, String numero) {
		this.nombre = nombre.substring(0,1).toUpperCase()+nombre.substring(1).toLowerCase(); ;
		this.numero=numero;
	
	}
	public Contacto(String nombre){
		this.nombre = nombre.substring(0,1).toUpperCase()+nombre.substring(1).toLowerCase(); ;
		this.numero="0";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	
	public int compareTo(Contacto otro) {
		return this.nombre.compareTo(otro.getNombre());
	}
	
	@Override
	public String toString() {
		return "Nombre: "+this.nombre+"\nNumero: "+this.numero;
	}
	
	 
	 @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
	
	 @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto= (Contacto) o;
        return this.compareTo((Contacto)o)==0;
    }

	

}
