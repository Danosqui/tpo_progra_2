package ej12;
import tda.ABBTDA;
import imple.ABB;

public class Uso {
	
	public static void main(String[] args) {
		ABBTDA arbolito = new ABB();
		arbolito.inicializarArbol();
		arbolito.agregarElem(1);
		arbolito.agregarElem(2);
		arbolito.agregarElem(3);
		arbolito.agregarElem(4);
		arbolito.agregarElem(5);
		arbolito.agregarElem(16);
		arbolito.agregarElem(144);
		arbolito.agregarElem(19);
		System.out.println(sumaImpares(arbolito));
	}
	
	public static int sumaImpares(ABBTDA arbol) {
		if (arbol.arbolVacio())
			return 0;
		
		int raizImpar = 0;
		if (arbol.raiz() % 2 !=0)
			raizImpar=arbol.raiz();
		
		
		return sumaImpares(arbol.hijoDer()) + sumaImpares(arbol.hijoIzq()) + raizImpar;
	}

	

}
