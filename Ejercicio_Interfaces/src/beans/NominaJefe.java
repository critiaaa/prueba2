package beans;

import Interfaces.INomina;

public class NominaJefe implements INomina {

	private String nombre;
	private double suledoBase;
	
	public NominaJefe(String nombre, double suledoBase) {
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

	public void setSuledoBase(double suledoBase) {
		this.suledoBase = suledoBase;
	}

	public String calculonominia() {
		double total = 0;
		String cadena; 
		total = this.suledoBase + this.suledoBase *0.30 + complementoSalarial;
		cadena = this.nombre + " cobra : " + total + "€";
		return cadena;
	}

	@Override
	public String toString() {
		return "NominaJefe [nombre=" + nombre + ", suledoBase=" + suledoBase + "]";
	}
	
	

}
