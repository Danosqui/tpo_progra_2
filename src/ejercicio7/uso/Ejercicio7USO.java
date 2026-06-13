package ejercicio7.uso;
import tda.PilaTDA;
import tda.ConjuntoTDA;
import ejercicio7.imple.Ejercicio7Imple;
import imple.Conjunto;
public class Ejercicio7USO {
	public static void main(String[] args) {
	PilaTDA pila = new Ejercicio7Imple();
	pila.inicializarPila();
	
	pila.apilar(2);
	pila.apilar(5);
	pila.apilar(8);
	pila.apilar(8);
	pila.apilar(10);
	pila.apilar(7);
	
	ConjuntoTDA conjunto = funcion(pila);
	while(!conjunto.conjuntoVacio())
	{
		int numero=conjunto.elegir();
		System.out.print(numero);
		conjunto.sacar(numero);
	}
	}

	private static ConjuntoTDA funcion(PilaTDA pila) {
		// TODO Auto-generated method stub
		 	ConjuntoTDA conjunto = new Conjunto();
		    conjunto.inicializarConjunto();

		    PilaTDA aux = new Ejercicio7Imple();
		    aux.inicializarPila();

		    int[] lista = new int[100];
		    int puntero = 0;

		    while (!pila.pilaVacia()) {
		        int numero = pila.tope();
		        pila.desapilar();

		        lista[puntero] = numero;
		        puntero++;

		        aux.apilar(numero);
		    }
		    while (!aux.pilaVacia()) {
		        int numero = aux.tope();
		        aux.desapilar();
		        pila.apilar(numero);
		    }

		    for (int i = 0; i < puntero; i++) {
		        for (int j = i + 1; j < puntero; j++) {
		            if (lista[i] == lista[j]) {
		                conjunto.agregar(lista[i]);
		            }
		        }
		    }

		    return conjunto;
	}
}