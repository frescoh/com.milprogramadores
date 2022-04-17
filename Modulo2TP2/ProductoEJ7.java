package com.milprogramadores.Modulo2TP2;

public class ProductoEJ7 {
	private int id;
	private String nombre;
	private String categoria;
	private double precio;
	private int stock;
	
	

	public ProductoEJ7(int id, String nombre, String categoria, double precio, int stock) {
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria.toLowerCase();
		this.precio = precio;
		this.stock = stock;
	}
	
	public boolean validarStock(int cantidad) {
		return this.stock>=cantidad;
	}
	
	public double vender(String categoria, int unidades) {
		if(this.validarStock(unidades)) {
			if(this.categoria.compareTo(categoria.toLowerCase())==0) {
				this.stock-=unidades;
				return unidades*this.precio;
			}
			else
				System.out.println("No hay stock suficiente para realziar la venta. Solo quedan "+this.stock+" unidaes");
		}
		else {
			System.out.println("La venta no se puede realizar porque no coincide la categoria");
		}
		return 0;	
	}
	
	public void comprar(String categoria, int cantidad) {
		if(!this.validarStock(100)&&this.categoria.compareTo(categoria.toLowerCase())==0) {
			this.stock+=cantidad;
			System.out.println(this.toString());
		}
		else
			System.out.println("No se pudo agregar la compra");
	}
	
	@Override
	public String toString() {
		return "ProductoEJ7 [id=" + id + ", nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio
				+ ", stock=" + stock + "]";
	}

}
