package Matrizes.desafio2.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a ordem da matriz? (Maximo 10) ");
		int n = sc.nextInt();
		int[][] mat = null;
		
		if(n <= 10) {
			mat = new int[n][n];
		}
		
		int numerosNegativos = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
				
				if(mat[i][j] < 0) {
					numerosNegativos++;
				}
			}
		}
		
		System.out.println("Diagonal principal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		System.out.print("Quantidade de numeros negativos = " + numerosNegativos);
		
		
		sc.close();
	}
}
