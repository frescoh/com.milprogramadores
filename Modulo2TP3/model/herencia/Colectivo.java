package com.milprogramadores.Modulo2TP3.model.herencia;

public class Colectivo {
	int id;
	private String empresa;
	private String nombreChofer;
	private String marca;
	private String modelo;
	
	public Colectivo(int id, String empresa, String nombreChofer, String marca, String modelo) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.nombreChofer = nombreChofer;
		this.marca = marca;
		this.modelo = modelo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getNombreChofer() {
		return nombreChofer;
	}

	public void setNombreChofer(String nombreChofer) {
		this.nombreChofer = nombreChofer;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" [id=" + id + ", empresa=" + empresa + ", nombre del Chofer=" + nombreChofer + ", marca=" + marca
				+ ", modelo=" + modelo + "]";
	}
	
	

}
