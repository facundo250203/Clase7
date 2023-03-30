package Pto1;
import Pto1.Carrito;
import Pto1.Producto;
import Pto1.itemCarrito;
import Pto1.Main;

public class Descuento extends Carrito {

	 public Descuento(itemCarrito item1, itemCarrito item2, itemCarrito item3,String op,int codi,Double desc) {
		super(item1, item2, item3);
		if(op.equals("FIJO")) {
			if(codi==item1.getCodigo())
			{
				item1.setPrecio(1, item1.getPrecio()-desc);
			}
			else if(codi==item2.getCodigo()) {
				item2.setPrecio(1, item2.getPrecio()-desc);
			}
			else if(codi==item3.getCodigo()) {
				item3.setPrecio(1, item3.getPrecio()-desc);
			}
		}
		
		else if(op.equals("PORCENTUAL")) {
			if(codi==item1.getCodigo())
			{
				if(item1.getPrecio()*desc>80) {
					item1.setPrecio(1,item1.getPrecio()- 80.0);
				}
				else{
				item1.setPrecio(1, item1.getPrecio()-item1.getPrecio()*desc);
				}
			}
			else if(codi==item2.getCodigo()) {
				if(item2.getPrecio()*desc>80) {
				item2.setPrecio(1, item1.getPrecio()-80.0);	
				}
				else {
				item2.setPrecio(1, item2.getPrecio()-item2.getPrecio()*desc);	
				}
				
			
			}
			else if(codi==item3.getCodigo()) {
				if(item3.getPrecio()*desc>80)
				{
				item3.setPrecio(1, item3.getPrecio()-80.0);	
				}
				else {
				item3.setPrecio(1, item3.getPrecio()-item3.getPrecio()*desc);			
				}
			}
		}	
	}	
}

