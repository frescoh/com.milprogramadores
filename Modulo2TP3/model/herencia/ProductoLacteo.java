package com.milprogramadores.Modulo2TP3.model.herencia;

public class ProductoLacteo extends Producto{
	private int porcentajeleche;
	private int temperaturaDeRefrigueracion;
	
	public ProductoLacteo(int id, double precio, String nombre, String fabricante, int stock, int porcentajeleche,
			int temperaturaDeRefrigueracion) {
		super(id, precio, nombre, fabricante, stock);
		this.porcentajeleche = porcentajeleche;
		this.temperaturaDeRefrigueracion = temperaturaDeRefrigueracion;
	}

	public int getPorcentajeleche() {
		return porcentajeleche;
	}

	public void setPorcentajeleche(int porcentajeleche) {
		this.porcentajeleche = porcentajeleche;
	}

	public int getTemperaturaDeRefrigueracion() {
		return temperaturaDeRefrigueracion;
	}

	public void setTemperaturaDeRefrigueracion(int temperaturaDeRefrigueracion) {
		this.temperaturaDeRefrigueracion = temperaturaDeRefrigueracion;
	}

	@Override
	public String toString() {
		return "ProductoLacteo [porcentajeleche=" + porcentajeleche + ", temperaturaDeRefrigueracion="
				+ temperaturaDeRefrigueracion + ", ID=" + getId() + ", Precio=" + getPrecio()
				+ ", Nombre=" + getNombre() + ", Fabricante=" + getFabricante() + ", Stock=" + getStock()
				+ "]";
	}
	
	
	
	
	

}
