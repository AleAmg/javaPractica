package monedero.main;

public class Monedero {
	private double dinero;
	
	public Monedero(double dineroInicial) {
		dinero=dineroInicial;
	}
	public void meter(double dinero) {
		this.dinero+=dinero;
	}
	private boolean hayDineroDisponibleParaSacar(double dinero) {
		return this.dinero>=dinero;
	}
	public void sacar(double dinero){
		if(hayDineroDisponibleParaSacar(dinero)) {
			this.dinero-=dinero;
		}
	}		
	public double verDinero() {
		return dinero;
	}
	@Override
	public String toString() {
		return "Hay $"+dinero;
	}

	
}

