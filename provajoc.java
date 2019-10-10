package juegocartas;


import java.util.ArrayList;

public class provajoc {
	public static void main (String arg []) {
	
	String palo; 
	String nombre;
	String valor;
	ArrayList<Carta> cartas = new ArrayList<Carta>();
	
	
	palo="Diamantes"; /* Para probar una carta */
	nombre="K";
	valor="10";
	Jugador joc1 = new Jugador(cartas, nombre);
	Carta CARTA1 = new Carta(palo,nombre,valor);
	System.out.println(CARTA1);
	joc1.darCarta(CARTA1);
	
	palo="Picas"; /* Para probar otra carta */
	nombre="7";
	valor="7";
	Jugador joc2 = new Jugador(cartas, nombre);
	Carta CARTA2 = new Carta(palo,nombre,valor);
	System.out.println(CARTA2);
	joc2.darCarta(CARTA2);
	
	palo="Corazones"; /* Para probar otra carta más */
	nombre="3";
	valor="3";
	Jugador joc3 = new Jugador(cartas, nombre);
	Carta CARTA3 = new Carta(palo,nombre,valor);
	System.out.println(CARTA3);
	joc3.darCarta(CARTA3);
   
    int i=1;
	joc1.retirarCarta(i); /* Retira CARTA1 */
    
    System.out.println(joc1.Juego()); /* Cartas que tiene */
    
/*FINAL*/
	}      
}