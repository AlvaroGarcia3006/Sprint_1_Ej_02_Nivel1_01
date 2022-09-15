package nivel1_ej01;

public class Producto {
	
	private String name;
	private float price;
	
	public Producto(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Producto [name=" + name + ", price=" + price + "]";
	}
	
}
