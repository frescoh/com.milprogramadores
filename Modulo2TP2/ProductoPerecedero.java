package com.milprogramadores.Modulo2TP2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class ProductoPerecedero extends Producto{
	private LocalDate  vencimiento;
	
	public ProductoPerecedero(String nombre, double precio, LocalDate vencimiento) {
		super(nombre, precio);
		this.vencimiento=vencimiento;
	}
	
	public LocalDate  getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(LocalDate  vencimiento) {
		this.vencimiento = vencimiento;
	}
	
	@Override
	public double calcular(int cantidad) {
		long dias = ChronoUnit.DAYS.between(LocalDate.now(),this.vencimiento);
		if(dias>3)
			return cantidad*this.precio;
		else {
			switch(String.valueOf(dias)) {
				case "3":
					return cantidad*this.precio*0.5;
				case "2":
					return cantidad *this.precio/3;
				case "1" :
					return cantidad*this.precio/4;
				default:
					return 0;
			}
		}
	}
	
	public String toString() {
		return super.toString()+"\nVencimiento: "+this.vencimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

}
