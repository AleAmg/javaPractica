package Vehiculo;

public abstract class Vehiculo {
	protected Persona chofer;
	private int km;
	
	public Vehiculo(Persona chofer) {
		this.chofer=chofer;

		
	}
	public Vehiculo() {}
	
	public void asignarChofer(Persona chofer) {
		this.chofer=chofer;	
	}
	 
	public abstract void cambiarChofer(Persona chofer);
	public int getKm() {
		return km;
	}
}
