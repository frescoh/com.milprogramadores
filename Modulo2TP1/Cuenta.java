package com.milprogramadores.Modulo2TP1;

public class Cuenta {
	private String nombre;
	private int numero;
	private double tipoDeInteres;
	private double saldo;
	
	public Cuenta(String nombre, int numero, double tipoDeInteres, double saldo) {
		this.nombre=nombre;
		this.numero=numero;
		this.tipoDeInteres=tipoDeInteres;
		this.saldo=saldo;
	}
	public Cuenta() {
		this.saldo=0;
		this.tipoDeInteres=0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getTipoDeInteres() {
		return tipoDeInteres;
	}

	public void setTipoDeInteres(double tipoDeInteres) {
		this.tipoDeInteres = tipoDeInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean ingreso(double ingreso) {
		if(ingreso>0)
		{
			this.saldo+=ingreso;
			return true;
		}
		else
			return false;
	}
	
	public boolean reintegro(double cantidad) {
		if(cantidad>0 && this.saldo-cantidad>0) {
			this.saldo-=cantidad;
			return true;
		}else
			return false;
	}
	
	public boolean transferencia(Cuenta cuentaDestino, double importe) {
		if(this.saldo <=importe) {
			this.saldo-=importe;
			return cuentaDestino.reintegro(importe);
		}else
			return false;
	}
}
