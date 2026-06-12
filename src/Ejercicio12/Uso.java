package Ejercicio12;
import tda.ABBTDA;
import imple.ABB;

public class Uso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABBTDA arbol = new ABB();
		arbol.inicializarArbol();
		
		arbol.agregarElem(1);
		arbol.agregarElem(20);
		arbol.agregarElem(10);
		arbol.agregarElem(15);
		arbol.agregarElem(12);
		arbol.agregarElem(35);
		
		int suma=funcion(arbol);
		System.out.print(suma);
	}

	private static int funcion(ABBTDA arbol) {
	    int suma = 0;

	    while (!arbol.arbolVacio()) {

	        suma =suma+ funcion(arbol.hijoIzq());
	        suma =suma+ funcion(arbol.hijoDer());

	        if (arbol.raiz() % 2 != 0) {
	            suma =suma+ arbol.raiz();
	        }

	        arbol.eliminarElem(arbol.raiz());
	    }
	    return suma;
	}
}
