package ej4.implementacion;

import ej4.tda.DiccionarioSimpleModTDA;
import imple.Conjunto;
import tda.ConjuntoTDA;

public class DiccionarioSimpleMod implements DiccionarioSimpleModTDA {
	private class Elemento {
		int clave;
		int valor;
		int factorMod;
	}
	
	private Elemento[] elementos;
	private int cant;

	@Override
	public void inicializarDiccionario() { // complejidad constante
		cant = 0;
		elementos = new Elemento[100];
	}

	@Override
	public void agregar(int clave, int valor) { // complejidad lineal
		int pos = this.claveAIndice(clave);
		if (pos == -1) {
			elementos[cant] = new Elemento();
			elementos[cant].clave = clave;
			elementos[cant].valor = valor;
			elementos[cant].factorMod = 0;
			cant++;
		} else {
			elementos[pos].valor = valor;
			elementos[pos].factorMod++;
		}

	}
	
	private int claveAIndice(int clave) { // complejidad lineal
		int i = cant - 1;
		while (i >= 0 && elementos[i].clave != clave)
			i--;
		return i;
	}

	@Override
	public void eliminar(int clave) { // complejidad lineal
		int pos = this.claveAIndice(clave);
		if (pos != -1) { //la clave existe
			elementos[pos] = elementos[cant-1];
			cant --;
		}

	}

	@Override
	public int recuperar(int clave) { // complejidad lineal
		int pos = claveAIndice(clave);
		return elementos[pos].valor;
	}

	@Override
	public int recuperarMod(int clave) { // complejidad lineal
		int pos = claveAIndice(clave);
		return elementos[pos].factorMod;
	}

	@Override
	public ConjuntoTDA claves() { // complejidad polinomica
		ConjuntoTDA c = new Conjunto();
		c.inicializarConjunto();
		for (int i=0; i < cant; i++) {
			c.agregar(elementos[i].clave);
		}
		return c;
	}

}
