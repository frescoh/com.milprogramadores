package com.milprogramadores.Modulo2TP2;

public class TestTaxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tipoTarifa= (int)(Math.random()*2)+1;
		Taxi taxi = new Taxi(1,2,tipoTarifa);
		int metros = (int)(Math.random()*101);
		System.out.println("Total a pagar por tarifa "+tipoTarifa+" y "+metros+" recorridos: "+taxi.calcularTotalAPagar(metros));
		taxi.cambiarTipoTarifa();
		metros = (int)(Math.random()*101);
		System.out.println("Total a pagar con cambio de tarifa y "+metros+" recorridos: "+taxi.calcularTotalAPagar(metros));

	}

}
