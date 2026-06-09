package Ejercicio10;

import tda.DiccionarioSimpleTDA;
import tda.PilaTDA;
import imple.Pila;
import imple.DiccionarioSimple;
import tda.ConjuntoTDA;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		PilaTDA pila = new Pila();

		pila.inicializarPila();
			
		pila.apilar(1);
		pila.apilar(2);
		pila.apilar(3);
		pila.apilar(4);
		pila.apilar(5);
		pila.apilar(4);
		pila.apilar(8);
		pila.apilar(8);
		pila.apilar(8);
		
		DiccionarioSimpleTDA dic = funcion(pila);
		ConjuntoTDA conjunto=dic.claves();
		
		while(!conjunto.conjuntoVacio())
			{
				int numero=conjunto.elegir();
				int recupero=dic.recuperar(numero);
				conjunto.sacar(numero);
				System.out.println(numero + " "+ recupero);
			}
	}

	private static DiccionarioSimpleTDA funcion(PilaTDA pila) {
		// TODO Auto-generated method stub
		DiccionarioSimpleTDA dic= new DiccionarioSimple();
		dic.inicializarDiccionario();
		int[] lista= new int[100];
		int puntero=0;
		while(!pila.pilaVacia())
		{
			int numero=pila.tope();
			lista[puntero]=numero;
			puntero++;
			pila.desapilar();
		}
		for(int i=0;i<puntero;i++)
		{
			int contador=1;
			for(int j=i+1;j<puntero;j++)
			{
				if(lista[i]==lista[j])
				{
					contador=contador+1;
					for(int u=j;u<puntero;u++)
					{
						lista[u]=lista[u+1];
					}
					j--;
					puntero--;
				}
			}
			dic.agregar(lista[i], contador);
		}
		return dic;
	}
}