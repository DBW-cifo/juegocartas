package juegocartas;

import java.util.ArrayList;

public class Francesa extends Baraja {
    /*super();*/
	@Override
	void barajar() {
		super.barajar();
	}
	@Override
	Carta repartir() {
		return super.repartir();
	}
	@Override
	public void reiniciar() {
	}		
	protected ArrayList<Carta> cartas = new ArrayList<Carta>();{
		if (cartas.size()>0) {
			cartas.clear();
		}

	String valor[] = {"1","2","3","4","5","6","7","8","9","10","10","10","10"};				
	String palo[] = {"picas","tréboles","diamentes","corazones"};
	String nombre[] = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};

	for (int P=0;P<palo.length;P++) {
		for (int N=0;N<nombre.length;N++) {
	     	cartas.add(new Carta(palo[P],nombre[N],valor[N]));
			System.out.println(palo[P]+nombre[N]+valor[N]);
		}
	}
	reiniciar();
}
	
}