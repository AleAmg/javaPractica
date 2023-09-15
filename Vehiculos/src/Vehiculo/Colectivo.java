package Vehiculo;

public class Colectivo extends Vehiculo{
	private Persona[] pasajeros;
	
	 int cantidadDP=0;
	
	public Colectivo(Persona chofer, int cantidadDP) {
		super(chofer);
		this.pasajeros=new Persona[cantidadDP];
				
	}
	public void agregarPasajero(Persona p) {
		if(cantidadDP<pasajeros.length) {
			pasajeros[cantidadDP]=p;
			cantidadDP++;
		}
	}
	
	public void cambiarChofer(Persona chofer) {
		if(pasajeros==null) {
			this.chofer=chofer;
		}
	}
}
