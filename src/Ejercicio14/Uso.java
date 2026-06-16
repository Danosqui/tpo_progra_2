package Ejercicio14;
import tda.GrafoTDA;
import imple.Grafo;
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
		
		int numero1 =1;
		int numero2 =4;
		funcion(grafo, numero1, numero2);
	}

	private static ConjuntoTDA funcion(GrafoTDA grafo, int numero1, int numero2) { // complejidad polinomica
		// TODO Auto-generated method stub
		ConjuntoTDA puentes = new Conjunto();
	    puentes.inicializarConjunto();

	    ConjuntoTDA vertices = grafo.vertices();


	    while (!vertices.conjuntoVacio()) {
	        int vertice = vertices.elegir();
	        vertices.sacar(vertice);

	        if (grafo.existeArista(numero1, vertice) && grafo.existeArista(vertice, numero2)) {
	            puentes.agregar(vertice);
	            System.out.println("Hay un puente en: " + vertice);
	        }
	    }

	    return puentes;
	}

}
