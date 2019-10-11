package juegocartas;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Baraja {
	protected ArrayList<Carta> cartas = new ArrayList<Carta>();
	
	void barajar() {
		Collections.shuffle(cartas);    
	}
	Carta repartir() {
		return cartas.remove(0);   
	}
	void reiniciar() {
		
	}
	
/* FINAL */
}