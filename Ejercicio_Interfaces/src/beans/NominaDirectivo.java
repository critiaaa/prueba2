package beans;

import Interfaces.INomina;

public class NominaDirectivo implements INomina {

	private String nombre;
	private double suledoBase;
	
	
	public NominaDirectivo(String nombre, double suledoBase) {
		super();
		this.nombre = nombre;
		this.suledoBase = suledoBase;
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getSuledoBase() {
		return suledoBase;
	}
	
	
	@Override
	public String toString() {
		return "NominaDirectivo [nombre=" + nombre + ", suledoBase=" + suledoBase + "]";
	}


	public void setSuledoBase(double suledoBase) {
		this.suledoBase = suledoBase;
	}

	@Override
	public String calculonominia() {
		double total = 0;
		String cadena; 
		total = this.suledoBase + this.suledoBase *0.50 + complementoSalarial + 300;
		cadena = this.nombre + " cobra : " + total + "€";
		return cadena;
	}

	//prueba
}
