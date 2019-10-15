package juegocartas;

import java.util.ArrayList;
import java.util.Scanner;

public class APLPOKER {
	public static void main (String arg []) {
		
		/* Jugadores del Poker */
			
		String nombre;
		int numpok=0;
		Francesa france = new Francesa();
		
		do {
		System.out.println("Indica número de jugadores para el POKER (>2): ");
		Scanner np = new Scanner(System.in);
		numpok = np.nextInt();
		} while (numpok < 2);
		
		int n=0;
	    for (int i=0;i<numpok;i++) {
	    n=i+1;
	    System.out.println("Indica nombre jugador "+n);
	    Scanner no = new Scanner(System.in);
	    nombre = no.nextLine();
	    System.out.println("*** Nombre indicado: "+nombre);    
	    
	    Jugador j = new Jugador(nombre);
	    j.setNombre(nombre);
	    Mus p = new Mus();
	    p.addJugador(j);   
	    }
/* FINAL */
}
}