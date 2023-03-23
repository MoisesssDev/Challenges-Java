package Vetores.desafio3.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros vc vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		if(n > 0 && n <= 10) {
			for(int i = 0; i < vect.length; i++) {
				System.out.print("Digite um numero: ");
				vect[i] = sc.nextInt();
			}
		} else {
			System.out.println("Digite um numero de 0 a 10!!!");
		}
		
		
		System.out.println();
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i : vect) {
			if(i < 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
