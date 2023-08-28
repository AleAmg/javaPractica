package poo2;
import static java.lang.Math.*;


public class Circulo {
	
	private double diametro;
	private Punto centro;
	private Color color;
	
	public Circulo(double radio, Punto centro, Color color) {
		setDiametro(radio*2);
		this.centro= centro;
		this.color= color;
	}
	
	public Circulo() {
		this(1,new Punto(),Color.BLANCO);
	}
	
	public void setDiametro(double diametro) {
		 if(diametro<=0) {
			 throw new Error(diametro+" es invalido");
		 }
		 this.diametro=diametro;
	}
	
	
	
	public double getDiametro() {
		return diametro;
	}
	public double getRadio() {
		return getDiametro()/2;
	}
	public void setRadio(double radio) {
		setDiametro(radio*2);
	}
	public double getPerimetro() {
		return Math.PI * getDiametro();
	}
	public void setPerimetro(double perimetro) {
		setDiametro(perimetro/Math.PI);
	}
	public double getArea() {
		return PI * pow(getRadio(),2);
	}
	public Color getColor() {
		return color;
	}
	@Override
	public String toString() {
		return diametro+" "+centro+" "+color;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Circulo c1 = new Circulo(5,new Punto(),Color.ROJO);
		System.out.println(c1.toString());
	}
}
