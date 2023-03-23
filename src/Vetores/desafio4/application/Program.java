package Vetores.desafio4.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		double soma = 0.0;
		
		for(int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
			
			soma += vect[i];
		}
		
		double media = soma / vect.length;
		
		System.out.println();
		System.out.print("VALORES = ");
		for (double d : vect) {
			System.out.print(d + " ");
		}
		System.out.println();
		System.out.println("SOMA = " + soma);
		System.out.println("MEDIA = " + media);
		
		
		sc.close();
	}
}
