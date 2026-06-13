package ej3.implementacion;

import ej3.tda.MultiPilaTDA;
import imple.Pila;
import tda.PilaTDA;


public class MultiPila implements MultiPilaTDA { //no puede extender pilatda porque los metodos tienen q recibir y devolver lo mismo
	
	private PilaTDA elementos;

	@Override
	public void apilar(PilaTDA valores) {

		PilaTDA copia = copiarPila(valores);
		PilaTDA aux = new Pila();
		aux.inicializarPila();
		while (!copia.pilaVacia()) {
			aux.apilar(copia.tope());
			copia.desapilar();
		}
		while (!aux.pilaVacia()) {
			elementos.apilar(aux.tope());
			aux.desapilar();
		}
		
		
		
	}

	@Override
	public void desapilar(PilaTDA valores) {
		
		PilaTDA valores2 = copiarPila(valores);
		PilaTDA elementosInv=new Pila();
		elementosInv.inicializarPila();
		
		boolean iguales = true;
		
		while (!valores2.pilaVacia() && iguales && !elementos.pilaVacia()) {
			iguales = valores2.tope()==elementos.tope();
			elementosInv.apilar(elementos.tope());
			elementos.desapilar();
			valores2.desapilar();
		}
		
		boolean exito = valores2.pilaVacia() && iguales; //osea si vaciaste valores y quedaron iguales
		
		if (!exito) {
			while (!elementosInv.pilaVacia()) {
				elementos.apilar(elementosInv.tope());
				elementosInv.desapilar();
			}
		}
		

	}

	@Override
	public PilaTDA tope(int cantidad) {
		PilaTDA primerosN = new Pila();
		primerosN.inicializarPila();
		while(!elementos.pilaVacia() && cantidad>0) {
			primerosN.apilar(elementos.tope());
			elementos.desapilar();
			cantidad--;
		}
		PilaTDA resultadovich = copiarPila(primerosN);
		while(!primerosN.pilaVacia()) {
			elementos.apilar(primerosN.tope());
			primerosN.desapilar();
		}
		return resultadovich;
	}

	@Override
	public void inicializarPila() {
		this.elementos = new Pila();
		elementos.inicializarPila();

	}

	@Override
	public boolean pilaVacia() {
		return elementos.pilaVacia();
	}
	
	private PilaTDA copiarPila(PilaTDA origen) {
	    PilaTDA aux = new Pila();
	    PilaTDA destino = new Pila();
	    
	    aux.inicializarPila();
	    destino.inicializarPila();
	    
	    while (!origen.pilaVacia()) {
	        aux.apilar(origen.tope());
	        origen.desapilar();
	    }
	    
	    while (!aux.pilaVacia()) {
	        int elemento = aux.tope();
	        destino.apilar(elemento);
	        origen.apilar(elemento);
	        aux.desapilar();
	    }
	    
	    return destino;
	}

}
