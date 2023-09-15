package Vehiculo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VehiculoTest {

	@Test
	void crearMoto() {
		
		Persona c1=new Persona();
		Moto m1=new Moto();
		m1.asignarChofer(c1);
		assertEquals(0,m1.getKm());
	}

}
