package Vehiculo;

public class Moto extends Vehiculo {
	private Persona acompañante;

	public Moto(Persona chofer) {
		super(chofer);
	}

	public Moto() {
	}

	public void cambiarChofer(Persona chofer) {
		if(acompañante==null) {
			super.asignarChofer(chofer);
		}
	}

	public void agregarAcompañante(Persona acompañante) {
		if(this.acompañante==null) {
			this.acompañante= acompañante;
		}
		
	}
}
