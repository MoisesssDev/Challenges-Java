package Poo.desafioBarOO.entities;

public class Bar {
	public char genero;
	public int cerveja;
	public int espetinho;
	public int refrigerante;
	
	public double cover() {
		if(feeding() < 30) {
			return 4.00;
		} else {
			return 0.00;
		}
		
	}
	
	public double feeding() {
		double valorCerveja = this.cerveja * 5;
		double valorEspetinho = this.espetinho * 7;
		double valorRefrigerante = this.refrigerante * 3;
		
		double total = valorCerveja + valorEspetinho + valorRefrigerante;
		return total;
	}
	
	public double ticket() {
		if(this.genero == 'F') {
			return 8.00;
		} else {
			return 10.00;
		}
	}
	
	public double total() {
		return cover() + feeding() + ticket();
	}
	
}
