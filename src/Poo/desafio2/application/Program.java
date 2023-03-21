package Poo.desafio2.application;

import java.util.Locale;
import java.util.Scanner;

import Poo.desafio2.entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados do produto: ");
		System.out.print("Nome: ");
		String name = sc.next();
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		System.out.print("Quantidade no estoque: ");
		int quantity = sc.nextInt();
		
		Produto produto = new Produto(name, price, quantity);
		
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		
		System.out.println();
		System.out.print("Adicione itens ao estoque: ");
		quantity = sc.nextInt();
		produto.addProduct(quantity);
		
		System.out.println();
		System.out.println("Dados atualizado: " + produto);
		
		System.out.println();
		System.out.print("Quantos foram removidos itens do estoque: ");
		quantity = sc.nextInt();
		produto.removeProduct(quantity);
		
		System.out.println();
		System.out.println("Dados atualizado: " + produto);
		
		sc.close();
	}

}
