package nivel1_ej01;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws EmptySaleException {
		
		Venta venta = new Venta();
		
		//Cálculo del total de ventas con el array vacío.
		try {
			venta.calcularTotal();
		}catch (EmptySaleException msg) {
			System.out.println(msg.getMessage()+"\n");
		}
		
		//Llamada al método que rellena el ArrayList.
		venta.generarListProducto();
		
		//Cálculo del total de ventas con elementos en el ArrayList.
		venta.calcularTotal();
		
		//Generando IndexOutOfBoundsException
		try {
			int size = venta.listProducto.size()+1;
			System.out.println(venta.listProducto.get(size));
		}catch (Exception e){
			System.out.println("\n"+e.getMessage());
		}
	}
}
