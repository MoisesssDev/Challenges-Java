package Vetores.desafio1.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sum = 0.0, media;
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			
			sum += vect[i];
		}
		
		
		media = sum / n;
		
		System.out.printf("MEDIA: %.2f", media);
		
		
		sc.close();
	}
}
