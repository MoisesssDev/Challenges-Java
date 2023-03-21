package Poo.desafioBarOO.application;

import java.util.Locale;
import java.util.Scanner;

import Poo.desafioBarOO.entities.Bar;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Bar cliente = new Bar();
		
		System.out.print("Sexo: ");
		cliente.genero = sc.next().charAt(0);
		System.out.print("Quantidade de cerveja: ");
		cliente.cerveja = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		cliente.refrigerante = sc.nextInt();
		System.out.print("Quantidade de espetinho: ");
		cliente.espetinho = sc.nextInt();
		System.out.println();
		
		System.out.println("RELATORIO:");
		System.out.printf("Consumo = R$ %.2f%n", cliente.feeding());
		System.out.printf("Couvert = R$ %.2f%n", cliente.cover());
		System.out.printf("Ingresso = R$ %.2f%n", cliente.ticket());
		System.out.println();
		
		System.out.printf("Valor a pagar = R$ %.2f", cliente.total());
		
		sc.close();
	}
}
