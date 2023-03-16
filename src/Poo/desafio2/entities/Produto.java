package Poo.desafio2.entities;

public class Produto {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	@Override
	public String toString() {
		return this.name
				+ ", $ "
				+ String.format("%.2f", this.price)
				+ ", " 
				+ this.quantity
				+ " unidades, "
				+ "Total: $ "
				+ String.format("%.2f", this.totalValueInStock());
	}
}
