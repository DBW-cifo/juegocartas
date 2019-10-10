package juegocartas;

public class Carta {
	private String palo;
    private String nombre;
    private String valor;
    
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Carta(String palo, String nombre, String valor) {
		super();
		this.palo = palo;
		this.nombre = nombre;
		this.valor = valor;
	}
	@Override
	public String toString (){
	    String msg=getNombre()+" de "+getPalo();
	    return msg;	
	}	
}
