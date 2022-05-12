package com.milprogramadores.Modulo2TP3.model.herencia;

public class Producto {
	private int id;
	private double precio;
	private String nombre;
	private String fabricante;
	private int stock;
	
	public Producto(int id, double precio, String nombre, String fabricante, int stock) {
		super();
		this.id = id;
		this.precio = precio;
		this.nombre = nombre;
		this.fabricante = fabricante;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", precio=" + precio + ", nombre=" + nombre + ", fabricante=" + fabricante
				+ ", stock=" + stock + "]";
	}

	
	
	
	
}
