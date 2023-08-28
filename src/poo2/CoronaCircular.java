package poo2;

public class CoronaCircular {

	private Circulo grande;
	private Circulo agujero;
	
	public CoronaCircular(double ri, double re,Punto centro, Color color) {
		this.grande = new Circulo(re, centro,color);
		this.agujero = new Circulo(ri, centro,Color.BLANCO);
	}
	public double getRadioInterior() {
		return agujero.getRadio();
	}
	public double getRadioExterior() {
		return agujero.getRadio();
	}
	public double getPerimetroInterior() {
		return agujero.getPerimetro();
	}
	public double getPerimetroExterior() {
		return agujero.getPerimetro();
	}
	@Override
	public String toString() {
		return grande+" "+agujero;
	}
	
	public static void main(String[] args) {
		CoronaCircular c1=new CoronaCircular(1.0,2.0,new Punto(),Color.AZUL);
		
		System.out.println(c1);
	}
	
}
