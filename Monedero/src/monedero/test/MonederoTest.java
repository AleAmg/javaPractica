package monedero.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import monedero.main.Monedero;

class MonederoTest {

	@Test
	public void verificarDinero() {
		Monedero m1 = new Monedero(15);
		assertEquals(15,m1.verDinero());
	}
	@Test
	public void agregarDinero() {
		Monedero m2= new Monedero(15);
		m2.meter(10);
		assertEquals(25,m2.verDinero());
	}
	@Test
	public void sacarDinero() {
		Monedero m3= new Monedero(15);
		m3.sacar(10);
		assertEquals(5,m3.verDinero());
	}
	@Test
	public void todo() {
		Monedero m4= new Monedero(15);
		m4.meter(10);
		m4.sacar(20);
		assertEquals(5,m4.verDinero());
	}
}
