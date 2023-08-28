package poo2;

public class SEgmento {

	private Punto a;
	private Punto b;
	
	public SEgmento(double x1,double y1,double x2,double y2) {
		this(new Punto(x1,y1),new Punto(x2,y2));
	}
	
	public SEgmento(Punto a,Punto b) {
		if(a.equals(b)) {
			throw new Error("");
		}
		this.a=a;
		this.b=b;
	}
	public double getLongitud() {
		return a.distancia(b);
	}
	
	public boolean esParaleloAlEjeX() {
		return this.a.getY()==this.b.getY();
	}
	public boolean esParaleloAlEjeY() {
		return this.a.getX()==this.b.getX();
	}
	
	public double pendiente() {
		return (this.a.getY()-this.b.getY())/(this.a.getX()-this.b.getX());
	}
	
	public boolean esParalelo(SEgmento s) {
		return this.pendiente()==s.pendiente();
	}
	@Override
	public String toString() {
		return a+" "+b;
	}
	
	public static void main(String[] args) {
		Punto a = new Punto(1,1);
		Punto b = new Punto(1,4);
		
		SEgmento s1 = new SEgmento(a,b);
		SEgmento s2 = new SEgmento(2,3,3,2);
		System.out.println(s1);
		System.out.println(s2);

	}

}
