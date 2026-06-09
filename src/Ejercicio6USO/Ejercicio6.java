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
		// TODO Auto-generated method stub
		float contador=0;
		float contador2=0;
		while(!pila.pilaVacia())
		{
			int numero=pila.tope();
			pila.desapilar();
			contador=contador+1;
			if(numero%2==0)
			{
				contador2=contador2+1;
			}
		}
		float promedio = (contador2/contador)*100;
		return promedio;
	}
}
