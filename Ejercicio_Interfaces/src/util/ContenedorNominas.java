package util;

import java.util.Vector;

import Interfaces.INomina;

public class ContenedorNominas {

	private Vector<INomina> nominas = new Vector<INomina>();
	
	public Vector<INomina> getNomina() {
		return nominas;
	}
	
	public void add (INomina figura) {
		nominas.add(figura);
	}
	
	public void list () {
		
		for (INomina nominas : nominas) {
			System.out.println(nominas.calculonominia());
		}
	}
	
}
