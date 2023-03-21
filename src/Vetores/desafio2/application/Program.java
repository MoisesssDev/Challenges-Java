package Vetores.desafio2.application;

import java.util.Locale;
import java.util.Scanner;

import Vetores.desafio2.entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sum = 0.0;
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new Product(name, price);
			sum += vect[i].getPrice();
		}
		
		double media = sum / vect.length;
		
		System.out.println();
		System.out.printf("MEDIA: %.2f", media);
		
		sc.close();
	}
}
