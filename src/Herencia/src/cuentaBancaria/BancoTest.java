package cuentaBancaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BancoTest {

	@Test
	public void testTitular() {
		Titular t = new Titular(12345, "pepe");
		assertEquals (12345, t.getCbu());
		assertEquals ("pepe", t.getNombre());
		
		CajaDeAhorros ca = new CajaDeAhorros(666, 000, t);
		assertEquals(t, ca.getTitular());
	}
	
}
