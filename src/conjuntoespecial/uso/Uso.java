package conjuntoespecial.uso;
import conjuntoespecial.interfaz.ConjuntoEspecialTDA;
import conjuntoespecial.interfaz.ConjuntoEspecialTDA.Respuesta;
import conjuntoespecial.implementacion.ConjuntoEspecial;
public class Uso {

	public static void main(String[] args) {
		//pruebitas
		ConjuntoEspecialTDA c = new ConjuntoEspecial();
		c.inicializarConjunto();
		Respuesta x = c.agregar(1);
		
		x = c.agregar(2);
		x = c.agregar(3);
		x = c.agregar(3);
		x = c.agregar(4);
		x = c.agregar(5);
		x = c.agregar(6);
		c.sacar(4);
		
		ConjuntoEspecialTDA aux = c;
		while (!aux.conjuntoVacio()) {
		    Respuesta valor = aux.elegir();
		    System.out.println(valor.rta);
		    aux.sacar(valor.rta);
		}
		
	}

}
