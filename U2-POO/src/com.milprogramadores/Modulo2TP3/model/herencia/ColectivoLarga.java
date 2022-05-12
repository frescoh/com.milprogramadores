package com.milprogramadores.Modulo2TP3.model.herencia;

public class ColectivoLarga extends Colectivo{
	private double pesoEquipaje;

	public ColectivoLarga(int id, String empresa, String nombreChofer, String marca, String modelo,
			double pesoEquipaje) {
		super(id, empresa, nombreChofer, marca, modelo);
		this.pesoEquipaje = pesoEquipaje;
	}

	public double getPesoEquipaje() {
		return pesoEquipaje;
	}

	public void setPesoEquipaje(double pesoEquipaje) {
		this.pesoEquipaje = pesoEquipaje;
	}

	@Override
	public String toString() {
		return "ColectivoLarga [Id=" + getId() + ", Empresa="
				+ getEmpresa() + ", Nombre del Chofer=" + getNombreChofer() + ", Marca=" + getMarca()
				+ ", Modelo=" + getModelo() + ", Peso de Equipaje=" + getPesoEquipaje()+"]";
	}
	
	
	

}
