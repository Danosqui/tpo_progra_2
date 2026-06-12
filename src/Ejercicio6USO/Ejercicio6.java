package Ejercicio6USO;
import Ejercicio6Imple.Ejercicio6Imple;
import tda.PilaTDA;
public class Ejercicio6 {
	public static void main(String[] args) {
	PilaTDA pila = new Ejercicio6Imple();
	pila.inicializarPila();
	
	pila.apilar(2);
	pila.apilar(5);
	pila.apilar(8);
	pila.apilar(8);
	pila.apilar(10);
	pila.apilar(7);
	
	float numero=funcion (pila);
	
	System.out.print(numero+"% son pares");
	
	}

	private static float funcion(PilaTDA pila) {
	    PilaTDA aux = new Ejercicio6Imple();
	    aux.inicializarPila();

	    float total = 0;
	    float pares = 0;

	    while (!pila.pilaVacia()) {
	        int numero = pila.tope();
	        pila.desapilar();

	        total++;

	        if (numero % 2 == 0) {
	            pares++;
	        }
	        aux.apilar(numero);
	    }
	    while (!aux.pilaVacia()) {
	        int numero = aux.tope();
	        aux.desapilar();
	        pila.apilar(numero);
	    }
	    float porcentaje=(pares / total) * 100;
	    return porcentaje;
	}
}
