package cuentaBancaria;

public class CajaDeAhorros extends CuentaBancaria{
	
	public CajaDeAhorros(long numero, double saldo, Titular titular) {
		super(numero,saldo,titular);
	}
	public void extraer(double monto) {
		if(darSaldo()>=monto) {
			saldo-=monto;
		}
	}
	
}
			