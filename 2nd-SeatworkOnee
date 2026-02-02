public class Main {
	public static void main(String[] args) {

		Product product = new Product("Gaming Mouse", 1500.5, 3);

		System.out.println("Product Name: " + product.getName());
		System.out.println("Price: " + product.getPrice());
		System.out.println("Quantity: " + product.getQuantity());
		System.out.println("Total Amount: " + product.getTotalAmount());
	}
}

class Product {

	private String name;
	private double price;
	private int quantity;

	Product(String name, double price, int quantity) {
		this.setName(name);
		this.setPrice(price);
		this.setQuantity(quantity);
	}

	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	public int getQuantity() {
		return this.quantity;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalAmount() {
		return this.price * this.quantity;
	}
}
