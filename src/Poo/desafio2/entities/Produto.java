package Poo.desafio2.entities;

public class Produto {
	
	private String name;
	private double price;
	private int quantity;
	
	public Produto() {	
	}
	
	public Produto(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Produto(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
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
