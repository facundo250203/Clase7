package Pto1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarritoTest {

	@DisplayName("Calculamos precio total carrito")
	@Test
	void testPrecioCarrito() {
		Double aux = 0.0;
		
		Producto a = new Producto("Leche","Leche en polvo",0,0.0);
		Producto b = new Producto("Harina","Harina 000",0,0.0);
		Producto c = new Producto("Embutidos","Embutidos varios",0,0.0);
		
		a.setcant(2);
		b.setcant(1);
		c.setcant(1);
		
		a.setPrecio(a.getcant(), 40.0);
		b.setPrecio(b.getcant(), 100.0);
		c.setPrecio(c.getcant(), 10.0);
		
		
		itemCarrito Le = new itemCarrito(a.getNombre(), a.getDescripcion(), a.getcant(), a.getPrecio(), 1);
		itemCarrito Ha = new itemCarrito(b.getNombre(), b.getDescripcion(), b.getcant(), b.getPrecio(), 2);
		itemCarrito Em = new itemCarrito(c.getNombre(), c.getDescripcion(), c.getcant(), c.getPrecio(), 3);
		
		Carrito carrito = new Carrito(Le,Ha,Em);
	
		//Assertions.assertEquals(170.0,carrito.costoFinal());	
		
		/*Descuento de =new Descuento(Le, Ha, Em, "FIJO", Le.getCodigo(), 100.0);
		
		Assertions.assertNotEquals(100,carrito.costoFinal() );
		*/
		
		aux=Ha.getPrecio()*0.85;
		Descuento des =new Descuento(Le, Ha, Em, "PORCENTUAL", Ha.getCodigo(), aux);
		
		Assertions.assertEquals(25.0,des.getItem2().getPrecio());
		
	}

}
