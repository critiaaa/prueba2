package beans;

import Interfaces.INomina;

public class NominaEmpleado implements INomina {

	private String nombre;
	private double suledoBase;
	
	
	public NominaEmpleado(String nombre, double suledoBase) {
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

	
	@Override
	public String toString() {
		return "NominaEmpleado [nombre=" + nombre + ", suledoBase=" + suledoBase + "]";
	}

	@Override
	public String calculonominia() {
		double total = 0;
		String cadena; 
		total = this.suledoBase + complementoSalarial;
		cadena = this.nombre + " cobra : " + total + "€";
		return cadena;
	}
}
