package poo2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SegmentoTest {

	@Test
	public void test() {
		SEgmento s = new SEgmento(1,1,5,1);
		double esperado = 4;
		double obtenido = s.getLongitud();		
		
		assertEquals(esperado,obtenido,0.001);
	}
	@Test
	public void paraleloAXTest() {
		SEgmento s = new SEgmento(1,1,5,1);
		
		assertTrue(s.esParaleloAlEjeX());
	}
	@Test
	public void paraleloAYTest() {
		SEgmento s = new SEgmento(1,1,5,1);
		
		assertTrue(s.esParaleloAlEjeX());
	}
	@Test
	public void sonParalelosLosTest() {
		SEgmento s1 = new SEgmento(1,1,4,4);
		SEgmento s2	= new SEgmento(1,-1,4,2);
		
		assertTrue(s1.esParalelo(s2));
	}

}
