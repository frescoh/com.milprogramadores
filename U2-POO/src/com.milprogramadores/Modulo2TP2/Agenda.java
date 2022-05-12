package com.milprogramadores.Modulo2TP2;

import java.util.ArrayList;

public class Agenda {
	ArrayList<Contacto> agenda = new ArrayList<>(); 
	private int capacidad;
	
	public Agenda(int capacidad) {	
		this.capacidad=capacidad;
		}
	public Agenda() {
		this.capacidad=10;
	}
	
	public int add(Contacto contacto) {
		if(!this.agendaLlena() &&! this.existeContacto(contacto)) {
			agenda.add(contacto);
			agenda.sort((o1,o2)->o1.compareTo(o2));
			return 1;
		}
		else {
			if(this.agendaLlena())
				System.out.println("Agenda llena, no hay espacio para contectos nuevos");
			if(this.existeContacto(contacto))
				System.out.println("El contacto ingresado ya existe en la agenda");
			return 0;
		}
			
				
			
		
	}
	
	public void listarContactos() {
		for(Contacto c:agenda) 
			System.out.println(c+"\n");		
	}
	
	
	// existeContacto(Contacto contacto) con busqueda binaria
	// Esto se puede hacer porque la lista esta ordenada (ver linea 3 de metodo sort)
	/*
	public boolean existeContacto(Contacto contacto) {
		int ini =0,fin=this.agenda.size()-1, med=(ini+fin)/2;
		while(ini<fin&&contacto.compareTo(agenda.get(med))!=0) {		
			if(contacto.compareTo(agenda.get(med))>0)
				ini=med+1;
			else
				fin = med-1;
			med= (ini+fin)/2;
		}
		if(contacto.compareTo(agenda.get(med))==0)
			return true;
		else
			return false;
		
	}
	*/
	

	// existe contacto usando contains
	public boolean existeContacto(Contacto contacto) {
		return agenda.contains(contacto);
	}
	
	
	public void buscaContacto(String nombre) {
		int ini =0,fin=this.agenda.size()-1, med=(ini+fin)/2;
		while(ini<fin&&nombre.compareTo(agenda.get(med).getNombre())!=0) {		
			if(nombre.compareTo(agenda.get(med).getNombre())>0)
				ini=med+1;
			else
				fin = med-1;
			med= (ini+fin)/2;
		}
		if(nombre.compareTo(agenda.get(med).getNombre())==0)
			System.out.println(agenda.get(med).getNumero());
		else
			System.out.println("No se encontró el contato");
		
	}
	
	public void buscaContacto2(String nombre) {
		Contacto aux = new Contacto(nombre);
		int indice= agenda.indexOf(aux);
		if(indice!=-1)
			System.out.println(agenda.get(indice).getNumero());
		else
			System.out.println("No se encontró el contato");
			
	}
	
	public void eliminarContacto(String nombre) {
		Contacto aux = new Contacto(nombre);
		int indice= agenda.indexOf(aux);
		if(indice!=-1) {
			agenda.remove(indice);
			System.out.println("Contacto eliminado satisfactoriamente");
		}
		else
			System.out.println("No se encontró el contacto");
	}
	
	public boolean agendaLlena() {
		return agenda.size()==this.capacidad;
	}
	
	public int contactosLibres() {
		System.out.println("capacidad: "+this.capacidad+" ocupados "+agenda.size());
		return this.capacidad - agenda.size();
	}
	

}
