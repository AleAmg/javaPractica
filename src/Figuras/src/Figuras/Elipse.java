package Figuras;

public class Elipse extends Figura{
	private double rMayor;
	private double rMenor;

	public Elipse(double x, double y, double rMayor, double rMenor) {
		// TODO Auto-generated constructor stub
		super(x,y);
		this.rMayor=rMayor;
		this.rMenor=rMenor;	
	}
	@Override
	public double getArea(double x, double y, double rMayor, double rMenor) {
		// TODO Auto-generated method stub
		return 0;
	}

}
