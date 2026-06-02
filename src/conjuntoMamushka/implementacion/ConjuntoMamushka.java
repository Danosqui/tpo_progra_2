package conjuntoMamushka.implementacion;

import conjuntoMamushka.interfaz.ConjuntoMamushkaTDA;

public class ConjuntoMamushka implements ConjuntoMamushkaTDA {

	private class Nodo{
		int valor;
		Nodo sig;
	}
	
	private Nodo c;
	
	@Override
	public void inicializar() {
		c=null;
	}

	@Override
	public void guardar(int dato) {
		Nodo n = new Nodo();
		n.valor=dato;
		n.sig=c;
		c=n;

	}

	@Override
	public void sacar(int dato) {
		if(c!=null) {
			if (c.valor==dato) {
				c=c.sig;
			}
			else {
				Nodo aux = c;
				while(aux.sig!=null && aux.sig.valor!=dato) {
					aux=aux.sig;
				}
				if (aux.sig.valor==dato) {
					aux.sig=aux.sig.sig;
				}
			}
		}

	}

	@Override
	public int elegir() {
		
		return c.valor;
	}

	@Override
	public int perteneceCant(int dato) {
		Nodo aux = c;
		int count = 0;
		while (aux!=null) {
			if (aux.valor==dato){
				count++;
			}
			aux=aux.sig;
		}
		return count;
	}

	@Override
	public boolean estaVacio() {
		return c==null;
	}

}
