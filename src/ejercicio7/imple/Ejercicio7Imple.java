package ejercicio7.imple;

import tda.PilaTDA;

public class Ejercicio7Imple implements PilaTDA {
	int datos[];
	 int puntero;
	@Override
	public void apilar(int x) { // complejidad constante
		// TODO Auto-generated method stub
		datos[puntero]=x;
		puntero++;
	}

	@Override
	public void desapilar() { // complejidad constante
		// TODO Auto-generated method stub
		puntero--;
	}

	@Override
	public void inicializarPila() { // complejidad constante
		// TODO Auto-generated method stub
		datos=new int[100];
		puntero=0;
	}

	@Override
	public boolean pilaVacia() { // complejidad constante
		// TODO Auto-generated method stub
		return puntero ==0;
	}

	@Override
	public int tope() { // complejidad constante
		// TODO Auto-generated method stub
		return datos[puntero-1];
	}

}