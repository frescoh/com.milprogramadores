package com.milprogramadores.Modulo2TP2;

public class Taxi {
	private int id;
	private int NumeroTaxi;
	private int tipoDeTarifa;
	int precioDeBajadaDeBandera;
	
	public Taxi(int id, int NumeroTaxi, int tipoTarifa) {
		this.id=id;
		this.NumeroTaxi= NumeroTaxi;
		this.tipoDeTarifa=tipoTarifa;
		if(tipoTarifa==1)
			this.precioDeBajadaDeBandera = 58;
		else
			this.precioDeBajadaDeBandera=70;
	}
	
	public void cambiarTipoTarifa() {
		if(this.tipoDeTarifa==1) {
			this.tipoDeTarifa=2;
			this.precioDeBajadaDeBandera=70;
		}
		else {
			this.tipoDeTarifa=1;
			this.precioDeBajadaDeBandera = 58;
		}
			
		System.out.println("Cambio de tarifa exitoso!");
	}
	
	public int calcularTotalAPagar(int metros) {
		if(this.tipoDeTarifa==1) 
			return this.precioDeBajadaDeBandera+metros*5;
		else
			return this.precioDeBajadaDeBandera+8*metros;
		
	}

}
