package juegocartas;

import java.util.ArrayList;
import java.util.Collections;

abstract class Baraja {
	protected ArrayList<Carta> cartas = new ArrayList<Carta>();
	
	void barajar() {
		Collections.shuffle(cartas);    
	}
	Carta repartir() {
		return cartas.remove(0);   
	}
	public void reiniciar() {
		
	}
	
/* FINAL */
}