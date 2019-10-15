package juegocartas;

import java.util.ArrayList;
import java.util.Scanner;

public class APLMUS {
	public static void main (String arg []) {
	
	/* Jugadores del Mus */
	
	Espanyola spain = new Espanyola();
	String nombre;
	int nummus=0;
	System.out.println("Indica número de jugadores para el MUS: ");
	Scanner nm = new Scanner(System.in);
	nummus = nm.nextInt();
	
    for (int i=1;i<=4;i++) {
    System.out.println("Indica nombre jugador "+i);
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