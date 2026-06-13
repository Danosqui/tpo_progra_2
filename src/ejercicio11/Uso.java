package ejercicio11;
import tda.ColaTDA;
import tda.DiccionarioMultipleTDA;
import imple.DiccionarioMultiple;
import tda.ConjuntoTDA;
import imple.Conjunto;
import imple.Cola;
public class Uso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColaTDA cola = new Cola();
		cola.inicializarCola();
		DiccionarioMultipleTDA dic= new DiccionarioMultiple();
		dic.inicializarDiccionario();
		
		dic.agregar(1, 2);
		dic.agregar(1, 1);
		dic.agregar(1, 2);
		dic.agregar(2, 3);
		dic.agregar(5, 7);
		
		ColaTDA cola2= funcion(dic);
		
	}

	private static ColaTDA funcion(DiccionarioMultipleTDA dic) {
		ColaTDA cola = new Cola();
		cola.inicializarCola();
		
		ConjuntoTDA conjunto = new Conjunto();
		conjunto.inicializarConjunto();
		ConjuntoTDA recupero = new Conjunto();
		recupero.inicializarConjunto();
		
		
		conjunto=dic.claves();
		while(!conjunto.conjuntoVacio())
		{
			int numero=conjunto.elegir();
			recupero=dic.recuperar(numero);
			conjunto.sacar(numero);
			while(!recupero.conjuntoVacio())
			{
				int numero2=recupero.elegir();
				cola.acolar(numero2);
				System.out.print(numero2);
				recupero.sacar(numero2);
				
			}
		}
		return cola;
	}

}
