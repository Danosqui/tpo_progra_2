package Ejercicio7USO;
import Ejercicio7.Ejercicio7Imple;
import tda.PilaTDA;
import tda.ConjuntoTDA;
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
	int[] lista = new int[100];
	int puntero=0;
	while(!pila.pilaVacia())
	{
		int numero=pila.tope();
		lista[puntero]=numero;
		puntero++;
		pila.desapilar();
	}
	for (int i=0;i<puntero;i++)
	{
		for(int j=i+1;j<puntero;j++)
		{
			if(lista[i]==lista[j])
			{
				conjunto.agregar(lista[i]);
			}
		}
	}
	return conjunto;
	}
}