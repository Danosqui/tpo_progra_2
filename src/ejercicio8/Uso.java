package ejercicio8;

import imple.Cola;
import tda.ColaTDA;
public class Uso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaTDA cola = new Cola();
		cola.inicializarCola();
		
		cola.acolar(1);
		cola.acolar(4);
		cola.acolar(3);
		cola.acolar(4);
		cola.acolar(4);
		cola.acolar(4);
		cola.acolar(1);
		
		ColaTDA cola2= funcion(cola);
		while(!cola2.colaVacia())
		{
			int numero=cola2.primero();
			System.out.print(numero);
			cola2.desacolar();
		}
		
	}

	private static ColaTDA funcion(ColaTDA cola) {
		// TODO Auto-generated method stub
		ColaTDA aux = new Cola();
	    aux.inicializarCola();

	    int[] lista = new int[100];
	    int puntero = 0;

	    while (!cola.colaVacia()) {
	        int numero = cola.primero();
	        cola.desacolar();

	        lista[puntero] = numero;
	        puntero++;

	        aux.acolar(numero);
	    }
	    while (!aux.colaVacia()) {
	        int numero = aux.primero();
	        aux.desacolar();

	        cola.acolar(numero);
	    }
	    
	    ColaTDA cola2 = new Cola();
	    cola2.inicializarCola();

	    
	    for (int i=0;i<puntero;i++) 
	    { 
	    	for (int j=i+1;j<puntero;j++) 
	    	{ 
	    		if(lista[i]==lista[j]) 
	    		{ 
	    			for (int u=j;u<puntero;u++) 
	    			{ 
	    				lista[u]=lista[u+1]; 
	    				} 
	    			puntero--; 
	    			j--; 
	    			} 
	    		} 
	    	} 
	    for(int i=0;i<puntero;i++) 
	    { 
	    	cola2.acolar(lista[i]); 
	    }

	    return cola2;
	}

}
