package cuentaBancaria;

public class CuentaCorriente extends CuentaBancaria{
	
	public CuentaCorriente(long numero, double saldo, Titular titular) {
		super(numero,saldo,titular);
	}
	public void extraer(double monto) {	
			saldo-=monto;
	}
}