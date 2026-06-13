package ejercicio13;
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
		arbol.agregarElem(50);
		arbol.agregarElem(34);
		
		int suma=funcion(arbol);
		System.out.print(suma);
	}

	private static int funcion(ABBTDA arbol) {
	    int suma = 0;

	    if (!arbol.arbolVacio()) {

	        if (arbol.hijoIzq().arbolVacio() &&
	            arbol.hijoDer().arbolVacio()) {

	            if (arbol.raiz() % 2 == 0) {
	                suma = suma + 1;
	            }
	        }

	        suma = suma + funcion(arbol.hijoIzq());
	        suma = suma + funcion(arbol.hijoDer());
	    }

	    return suma;
	}
}
