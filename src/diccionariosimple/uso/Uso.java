package diccionariosimple.uso;

import diccionariosimple.implementacionCola.DiccionarioSimpleCola;
import imple.Conjunto;
import tda.ConjuntoTDA;
import tda.DiccionarioSimpleTDA;

public class Uso {

    public static void main(String[] args) {
    	 
        DiccionarioSimpleTDA dic = new DiccionarioSimpleCola();
 
       
        dic.inicializarDiccionario();
 
    
        dic.agregar(10, 100);
        dic.agregar(20, 200);
        dic.agregar(30, 300);
        dic.agregar(40, 400);
 
        System.out.println(dic.recuperar(10));
        System.out.println(dic.recuperar(20));
        System.out.println(dic.recuperar(30)); 
        System.out.println(dic.recuperar(40));
        imprimirClaves(dic);
        dic.eliminar(20);
        imprimirClaves(dic);
 
        dic.agregar(10, 999);
        System.out.println(dic.recuperar(10));
        imprimirClaves(dic);
 
        ConjuntoTDA clavesRestantes = dic.claves();
        while (!clavesRestantes.conjuntoVacio()) {
            int c = clavesRestantes.elegir();
            dic.eliminar(c);
            clavesRestantes.sacar(c);
        }
        imprimirClaves(dic);
 
    }
 
    static void imprimirClaves(DiccionarioSimpleTDA dic) {
        ConjuntoTDA original = dic.claves();
        
        if (original.conjuntoVacio()) {
            System.out.println("vacio");
            return;
        }
 
        ConjuntoTDA aux = new Conjunto();
        aux.inicializarConjunto();
 
        while (!original.conjuntoVacio()) {
            int clave = original.elegir();
            System.out.println(clave + " val " + dic.recuperar(clave));
            aux.agregar(clave);
            original.sacar(clave);
        }
        System.out.println();
    }


}
