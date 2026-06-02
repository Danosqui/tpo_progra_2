package conjuntoMamushka.uso;

import conjuntoMamushka.implementacion.ConjuntoMamushka;
import conjuntoMamushka.interfaz.ConjuntoMamushkaTDA;

public class Uso {

	public static void main(String[] args) {

        ConjuntoMamushkaTDA c = new ConjuntoMamushka();
        c.inicializar();
        c.guardar(10);
        c.guardar(20);
        c.guardar(20);
        c.guardar(30);
        c.guardar(30);
        c.guardar(30);

        System.out.println("10: " + c.perteneceCant(10));
        System.out.println("20: " + c.perteneceCant(20));
        System.out.println("30: " + c.perteneceCant(30));
        System.out.println("99: " + c.perteneceCant(99));

        c.sacar(20);
        System.out.println(c.perteneceCant(20));

      
        ConjuntoMamushkaTDA aux = new ConjuntoMamushka();
        aux.inicializar();

        while (!c.estaVacio()) {
            int valor = c.elegir();
            System.out.println(valor);
            c.sacar(valor); 
            aux.guardar(valor);
        }
    }

}
