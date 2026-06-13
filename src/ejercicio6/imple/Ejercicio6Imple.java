package ejercicio6.imple;

import tda.PilaTDA;

public class Ejercicio6Imple implements PilaTDA {
	int datos[];
	 int puntero;
	@Override
	public void apilar(int x) {
		// TODO Auto-generated method stub
		datos[puntero]=x;
		puntero++;
	}

	@Override
	public void desapilar() {
		// TODO Auto-generated method stub
		puntero--;
	}

	@Override
	public void inicializarPila() {
		// TODO Auto-generated method stub
		datos=new int[100];
		puntero=0;
	}

	@Override
	public boolean pilaVacia() {
		// TODO Auto-generated method stub
		return puntero ==0;
	}

	@Override
	public int tope() {
		// TODO Auto-generated method stub
		return datos[puntero-1];
	}

}
