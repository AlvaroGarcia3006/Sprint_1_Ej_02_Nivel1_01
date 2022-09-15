package nivel1_ej01;
import java.util.ArrayList;

public class Venta {
	
	private float totalSales;
	ArrayList <Producto> listProducto = new ArrayList <Producto>();
	
	public Venta() {
		super();
	}

	public Venta(ArrayList<Producto> listProducto) {
		super();
		this.listProducto = listProducto;
	}

	public float getTotalSales() {
		return totalSales;
	}

	public ArrayList<Producto> getListProducto() {
		return listProducto;
	}

	//Método para calcular el total de ventas.
	public void calcularTotal() throws EmptySaleException{
		
		//Si el array está vacío lanza la excepción.
		if(listProducto.isEmpty()){
			throw new EmptySaleException("Para hacer una venta primero debes añadir productos");
		}
		for(Producto product: listProducto) {
			totalSales+= product.getPrice();
		}
		System.out.println("La suma total de las ventas es: " +totalSales+"€");
	}

	//Método que añade productos al arraylist.
	public void generarListProducto() {
		
		System.out.println("Se generá una lista de productos. ");
		listProducto.add(new Producto("Patata", (float)0.5));
		listProducto.add(new Producto("Cerveza", 3));
		listProducto.add(new Producto("Macarrones", (float)0.9));
		listProducto.add(new Producto("Pollo", (float)2.7));
		listProducto.add(new Producto("Tomate", 2));
		listProducto.add(new Producto("Naranjas", (float)3.4));	
	}
}
