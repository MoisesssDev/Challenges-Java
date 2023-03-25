package Matrizes.desafio3.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		while(m > 10 | n > 10) {
			System.out.println("Valor incorreto, quantidade maxima e 10.");
			System.out.println("Qual a quantidade de linhas da matriz? ");
			m = sc.nextInt();
			System.out.println("Qual a quantidade de colunas da matriz? ");
			n = sc.nextInt();
		}
		
		int[][] mat = new int[m][n];
		int[] vect = new int[mat.length];
		
		for (int i = 0; i < mat.length; i++) {
			System.out.println("Digite os elementos da " + (i+1) + "a. linha:");
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				vect[i] += mat[i][j];
			}
		}
		
		System.out.println("Vetor gerado: ");
		for (int i : vect) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
