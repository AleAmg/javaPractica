package carritoDeCompras;

import java.util.ArrayList;

public class CarritoDeCompras {
	private ArrayList<Producto> productos;

	public CarritoDeCompras() {
		productos = new ArrayList<Producto>();
	}
	
	public void agregarproducto(Producto producto) {
		productos.add(producto);
	}
	public int getCantProductos() {
		return productos.size();
	}
	public double getPrecioTotal() {
		double total=0;
		for(Producto producto:productos) {			
				total+=producto.getPrecio();			
		}
		return total;
	}
	public double getPrecioTotal(Categoria categoria) {
		double total=0;
		for(int i=0;i<productos.size();i++) {
			if(productos.get(i).getCategoria().equals(categoria)) {
				total+=productos.get(i).getPrecio();
			}
		}
		return total;
	}
	public double getPrecioTecnologia() {
		double total=0;
		for(int i=0;i<productos.size();i++) {
			if(productos.get(i).getCategoria()==Categoria.TECNOLOGIA) {
				total+=productos.get(i).getPrecio();
			}
		}
		return total;
	}

	

}
