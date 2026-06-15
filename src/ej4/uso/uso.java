package ej4.uso;
import ej4.tda.DiccionarioSimpleModTDA;
import ej4.implementacion.DiccionarioSimpleMod;

public class uso {

	public static void main(String[] args) {
		DiccionarioSimpleModTDA dic = new DiccionarioSimpleMod();
		dic.inicializarDiccionario();
		dic.agregar(1, 3);
		dic.agregar(4, 4);
		dic.agregar(1, 5);
		dic.agregar(1, 10);
		
		System.out.println(dic.recuperarMod(1));
		System.out.println(dic.recuperarMod(4));
		
	}

}
