package cuentaBancaria;

public abstract class CuentaBancaria {
	private long numero;
	protected double saldo;
	private Titular titular;
	
	public CuentaBancaria(long numero, double saldo,Titular titular) {
		this.numero=numero;
		this.saldo=saldo;
		this.titular=titular;
	}
	public double darSaldo() {
		return saldo;
	}
	public long darNumero() {
		return numero;
	}
	public void depositar(double dinero) {
		this.saldo+=dinero;
	}
	public abstract void extraer(double dinero);
	public Titular getTitular() {
		return titular;
	}
}
