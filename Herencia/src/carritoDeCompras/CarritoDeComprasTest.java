package carritoDeCompras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarritoDeComprasTest {
	
	@BeforeEach
	public void crearCarrito() {
		CarritoDeCompras carrito= new CarritoDeCompras();
	}
	
	@Test
	public void verificarCarritoVacio() {
		CarritoDeCompras carrito= new CarritoDeCompras();
		assertEquals(0, carrito.getCantProductos());
	}
	@Test
	public void verificarCarrito1() {
		CarritoDeCompras carrito= new CarritoDeCompras();
		Producto p1=new Producto("Maleducada", 100000, Categoria.TECNOLOGIA);
		carrito.agregarproducto(p1);
		assertEquals(1, carrito.getCantProductos());
	}
	@Test
	public void verificarCarritoTotal() {
		CarritoDeCompras carrito= new CarritoDeCompras();
		Producto p1=new Producto("Maleducada", 100000, Categoria.TECNOLOGIA);
		carrito.agregarproducto(p1);
		carrito.agregarproducto(p1);
		Producto p2=new Producto("Matonesa", 1000, Categoria.ALIMENTO);
		carrito.agregarproducto(p2);
		assertEquals(201000, carrito.getPrecioTotal());
	}
	@Test
	public void verificarCarritoTecnologia() {
		CarritoDeCompras carrito= new CarritoDeCompras();
		Producto p1=new Producto("Maleducada", 100000, Categoria.TECNOLOGIA);
		carrito.agregarproducto(p1);
		carrito.agregarproducto(p1);
		carrito.agregarproducto(p1);
		carrito.agregarproducto(p1);
		Producto p2=new Producto("Matonesa", 1000, Categoria.ALIMENTO);
		carrito.agregarproducto(p2);
		assertEquals(400000, carrito.getPrecioTecnologia());
	}
	@Test
	public void verificarCarritoAlimento() {
		CarritoDeCompras carrito= new CarritoDeCompras();
		Producto p1=new Producto("Maleducada", 100000, Categoria.TECNOLOGIA);
		carrito.agregarproducto(p1);
		Producto p2=new Producto("Matonesa", 1000, Categoria.ALIMENTO);
		carrito.agregarproducto(p2);
		assertEquals(1000, carrito.getPrecioTotal(Categoria.ALIMENTO));
	}
	
	
}
