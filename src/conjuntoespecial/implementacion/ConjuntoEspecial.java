package conjuntoespecial.implementacion;

import conjuntoespecial.interfaz.ConjuntoEspecialTDA;
import imple.Conjunto;

public class ConjuntoEspecial implements ConjuntoEspecialTDA {

	private class Nodo{
		int valor;
		Nodo sig;
	}
	private Nodo primero;
	
	@Override
	public void inicializarConjunto() {
		
		primero = null;

	}

	@Override
	public Respuesta agregar(int valor) {

		
		boolean pertenece = pertenece(valor);
		
		
		Respuesta rta = new Respuesta();
		rta.error=pertenece;
		if (!pertenece) {
			Nodo n = new Nodo();
			n.valor=valor;
			n.sig = primero;
			primero = n;
		}
			return rta;
	
		
	}

	@Override
	public Respuesta sacar(int valor) {
		
		
		Respuesta rta = new Respuesta();
		if (primero!=null) {
			if (primero.valor==valor) {
				
				primero = primero.sig;
				
				rta.error=false;
			}
			else {
				Nodo aux = primero;
				
				while (aux.sig.valor!=valor && aux.sig!=null) {
					
					aux=aux.sig;
				}
				if (aux.sig!=null) {
					aux.sig=aux.sig.sig;
					rta.error=false;
				}
				else rta.error=true;
			}
		}
		else {
			rta.error=true;
		}
		return rta;
	}

	@Override
	public Respuesta elegir() {
		Respuesta rta = new Respuesta();
		if (primero!=null) {
			rta.error=false;
			rta.rta=primero.valor;
		}
		else rta.error=true;
		return rta;
	}

	@Override
	public boolean pertenece(int valor) {
		Nodo aux = new Nodo();
		aux = primero;
		boolean pertenece = false;
		
		while (!pertenece && aux!=null) {
			pertenece = aux.valor==valor;
			aux=aux.sig;
		}
		return pertenece;
	}

	@Override
	public boolean conjuntoVacio() {
		return primero==null;
	}

}
