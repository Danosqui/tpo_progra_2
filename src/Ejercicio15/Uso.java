package Ejercicio15;

import imple.Grafo;
import tda.GrafoTDA;
import tda.ConjuntoTDA;
import imple.Conjunto;

public class Uso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrafoTDA grafo=new Grafo();
		grafo.inicializarGrafo();;
		
		grafo.agregarVertice(1);
		grafo.agregarVertice(2);
		grafo.agregarVertice(3);
		grafo.agregarVertice(4);
		grafo.agregarArista(1, 2, 1);
		grafo.agregarArista(2, 4, 2);
		grafo.agregarArista(3, 4, 3);
		grafo.agregarArista(1, 3, 3);
		grafo.agregarArista(3, 1, 9);
		
		int numero=3;
		funcion(grafo, numero);

	}

	private static int funcion(GrafoTDA grafo, int numero) { // complejidad polinomica
		// TODO Auto-generated method stub
	    ConjuntoTDA vertices = grafo.vertices();
	   

	    
	    int contador = 0;
		while(!vertices.conjuntoVacio())
		{
			int vertice= vertices.elegir();
			vertices.sacar(vertice);
			if (vertice != numero) 
			{
				if(grafo.existeArista(vertice, numero))
				{
				contador--;
				}
				if (grafo.existeArista(numero, vertice))
				{
				contador++;
				}
			}
		}
		System.out.print("El vertice "+numero+" es de grado: "+ contador);
		return contador;
	}

}
