package Figuras;

public abstract class Figura {
	private Punto p;
	
	public Figura(double x,double y) {
		this.p=new Punto(x,y);
		
	}
	public abstract double getArea(double x, double y,double rMayor,double rMenor);
	
}
