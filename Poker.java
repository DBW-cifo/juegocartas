package juegocartas;
import java.util.Scanner;
import java.util.ArrayList;

public class Poker {
	public ArrayList<Francesa> cartas = new ArrayList<Francesa>();
	public ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	/* if (jugadores.size()>=2) */
	   void addJugador(Jugador j) {
		  jugadores.add(j);
	   }
	/* }
	else {
	   System.out.println("*** Faltan jugadores ***");	
	}*/
}