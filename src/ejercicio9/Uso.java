package ejercicio9;
import tda.ColaTDA;
import tda.PilaTDA;
import imple.Cola;
import imple.Pila;
import imple.Conjunto;
import tda.ConjuntoTDA;
public class Uso {

	public static void main(String[] args) {

		PilaTDA pila = new Pila();
		ColaTDA cola=new Cola();
		pila.inicializarPila();
		cola.inicializarCola();
		
		pila.apilar(1);
		pila.apilar(2);
		pila.apilar(3);
		pila.apilar(4);
		pila.apilar(5);
		pila.apilar(4);
		pila.apilar(8);
		
		cola.acolar(1);
		cola.acolar(10);
		cola.acolar(11);
		cola.acolar(3);
		cola.acolar(4);
		
		ConjuntoTDA conjunto=funcion(pila, cola);
		while(!conjunto.conjuntoVacio())
		{
			int numero=conjunto.elegir();
			System.out.print(numero);
			conjunto.sacar(numero);
		}
		
	}

	private static ConjuntoTDA funcion(PilaTDA pila, ColaTDA cola) { // complejidad polinomica
		// TODO Auto-generated method stub
		int[] lista = new int[100];
	    int puntero = 0;

	    ColaTDA auxCola = new Cola();
	    auxCola.inicializarCola();

	    while (!cola.colaVacia()) {
	        int numero = cola.primero();
	        lista[puntero] = numero;
	        puntero++;

	        cola.desacolar();
	        auxCola.acolar(numero);
	    }

	   
	    while (!auxCola.colaVacia()) {
	        int numero = auxCola.primero();
	        auxCola.desacolar();
	        cola.acolar(numero);
	    }

	    int[] lista2 = new int[100];
	    int puntero2 = 0;

	    PilaTDA auxPila = new Pila();
	    auxPila.inicializarPila();

	    while (!pila.pilaVacia()) {
	        int numero = pila.tope();
	        lista2[puntero2] = numero;
	        puntero2++;

	        pila.desapilar();
	        auxPila.apilar(numero);
	    }

	   
	    while (!auxPila.pilaVacia()) {
	        int numero = auxPila.tope();
	        auxPila.desapilar();
	        pila.apilar(numero);
	    }

	    ConjuntoTDA conjunto= new Conjunto();
		conjunto.inicializarConjunto();
		for(int i=0;i<puntero;i++)
		{
			for (int j=0;j<puntero2;j++)
			{
				if(lista[i]==lista2[j])
				{
					conjunto.agregar(lista[i]);
				}
			}
		}
		return conjunto;
	}

}
