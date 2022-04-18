package com.milprogramadores.Modulo2TP3.model.herencia;

public class ProductoEnvasado extends Producto{
	private  String tipoDeEnvasado;

	public ProductoEnvasado(int id, double precio, String nombre, String fabricante, int stock, String tipoDeEnvasado) {
		super(id, precio, nombre, fabricante, stock);
		this.tipoDeEnvasado = tipoDeEnvasado;
	}

	public String getTipoDeEnvasado() {
		return tipoDeEnvasado;
	}

	public void setTipoDeEnvasado(String tipoDeEnvasado) {
		this.tipoDeEnvasado = tipoDeEnvasado;
	}

	@Override
	public String toString() {
		return "ProductoEnvasado [tipoDeEnvasado=" + tipoDeEnvasado + ", ID=" + getId() + ", Precio="
				+ getPrecio() + ", Nombre=" + getNombre() + ", Fabricante=" + getFabricante()
				+ ", Stock=" + getStock() + "]";
	}
	
	

}
