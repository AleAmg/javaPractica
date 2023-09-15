package cuentaBancaria;

public class Titular {
	private String nombre;
	private long cbu;
	
	public Titular(long cbu,String nombre) {
		this.cbu=cbu;
		this.nombre=nombre;
	}
	public long getCbu() {
		return cbu;
	}
	public String getNombre() {
		return nombre;
	}
	
}
