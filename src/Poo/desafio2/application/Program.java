package Poo.desafio2.application;

import java.util.Locale;
import java.util.Scanner;

import Poo.desafio2.entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Dados do produto: ");
		System.out.print("Nome: ");
		produto.name = sc.next();
		System.out.print("Preço: ");
		produto.price = sc.nextDouble();
		System.out.print("Quantidade no estoque: ");
		produto.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		
		System.out.println();
		System.out.print("Adicione itens ao estoque: ");
		int quantity = sc.nextInt();
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
