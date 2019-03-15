package test;

import Interfaces.INomina;
import beans.NominaDirectivo;
import beans.NominaEmpleado;
import beans.NominaJefe;
import util.ContenedorNominas;

public class test {

	public static void main(String[] args) {
		ContenedorNominas nominas = new ContenedorNominas ();
		
		INomina nd1 = new NominaDirectivo ("Jose" , 1800);
		INomina nd2 = new NominaDirectivo ("Pedro" , 1750);
		
		INomina nj1 = new NominaJefe ("Raul" , 1400);
		INomina nj2 = new NominaJefe ("Marcos" , 1200);
		
		INomina ne1 = new NominaEmpleado ("Cristian" , 1000);
		INomina ne2 = new NominaEmpleado ("David" , 900);
		
		nominas.add(nd1);
		nominas.add(nd2);
		nominas.add(nj1);
		nominas.add(nj2);
		nominas.add(ne2);
		nominas.add(ne1);
		
		nominas.list();
		


		
		
	}

}
