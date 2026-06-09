package ej5.diccionariosimple.implementacionCola;

import tda.ConjuntoTDA;
import tda.DiccionarioSimpleTDA;
import tda.ColaTDA;
import imple.Cola;
import imple.Conjunto;

public class DiccionarioSimpleCola implements DiccionarioSimpleTDA {
	
	private ColaTDA datos;
	private ColaTDA claves;

	@Override
	public void inicializarDiccionario() {
		datos = new Cola();
		datos.inicializarCola();
		claves = new Cola();
		claves.inicializarCola();
	}

	@Override
	public void agregar(int clave, int valor) {
		ColaTDA auxD = new Cola();
		ColaTDA auxC = new Cola();
		auxD.inicializarCola();
		auxC.inicializarCola();
		while (!datos.colaVacia() && claves.primero()!=clave) {
			auxD.acolar(datos.primero());
			auxC.acolar(claves.primero());
			datos.desacolar();
			claves.desacolar();
		}
		if (!datos.colaVacia()) {
			
			claves.desacolar();
			datos.desacolar();
		}
		
		datos.acolar(valor);
		claves.acolar(clave);
		System.out.println(datos.primero());
		
		while(!auxD.colaVacia()) { 
			datos.acolar(auxD.primero());
			claves.acolar(auxC.primero());
			auxD.desacolar();
			auxC.desacolar();
		}
	}

	@Override
	public ConjuntoTDA claves() {
		ColaTDA aux = copiarCola(claves);
		ConjuntoTDA claves2 = new Conjunto();
		
		
		claves2.inicializarConjunto();
		
		while (!aux.colaVacia()) {
			claves2.agregar(aux.primero());
			aux.desacolar();
		}
		
		
		return claves2;
	}

	@Override
	public void eliminar(int n) {
		ColaTDA auxD = new Cola();
		ColaTDA auxC = new Cola();
		auxD.inicializarCola();
		auxC.inicializarCola();
		
		while (!datos.colaVacia() && claves.primero()!=n) {
			auxD.acolar(datos.primero());
			auxC.acolar(claves.primero());
			datos.desacolar();
			claves.desacolar();
		}
		if (claves.primero()==n) {
			claves.desacolar();
			datos.desacolar();
		}
		
		while(!auxD.colaVacia()) { //se desordena pero no importa porque es un diccio
			datos.acolar(auxD.primero());
			claves.acolar(auxC.primero());
			auxD.desacolar();
			auxC.desacolar();
		}

	}


	@Override
	public int recuperar(int n) {
		ColaTDA auxD = new Cola();
		ColaTDA auxC = new Cola();
		auxD.inicializarCola();
		auxC.inicializarCola();
		
		
		while (!datos.colaVacia() && claves.primero()!=n) {
			auxD.acolar(datos.primero());
			auxC.acolar(claves.primero());
			datos.desacolar();
			claves.desacolar();
		}
		int ret;
		if (!datos.colaVacia()) {
			ret = datos.primero();
		}
		else {
			throw new RuntimeException();
		}
		while(!auxD.colaVacia()) {
			datos.acolar(auxD.primero());
			claves.acolar(auxC.primero());
			auxD.desacolar();
			auxC.desacolar();
		}
		
		return ret;
	}
	
	private ColaTDA copiarCola(ColaTDA original) {
		ColaTDA copia = new Cola();
		ColaTDA aux = new Cola();
		copia.inicializarCola();
		aux.inicializarCola();
		while (!original.colaVacia()) {
			copia.acolar(original.primero());
			aux.acolar(original.primero());
			original.desacolar();
		}
		
		while(!aux.colaVacia()) {
			original.acolar(aux.primero());
			aux.desacolar();
		}
		return copia;
	}

}
