package juegocartas;

import java.util.ArrayList;

public class Jugador {
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	private String nombre;
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Jugador(String nombre) {
		this.nombre = nombre;
	}
		public void darCarta(Carta nombre) {
		  cartas.add(nombre);
	    }
	
		Carta retirarCarta(int i) {
          return cartas.remove(i);  
		}
	
		String Juego() {      
			String astr="";
			String bstr="[";
			int i=1;
			for (Carta j:cartas) {
				astr = j.toString();
			    if (i<cartas.size()) {
					bstr=bstr+astr+",";
					i++;
			    }
			    else {
					bstr=bstr+astr;
			    }
		    }			
			return bstr+"]";
		}
/*FINAL*/  
}