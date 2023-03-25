package Matrizes.desafio4.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a ordem da matriz? (Maximo 10) ");
		int n = sc.nextInt();
		int[][] mat = null;
		List<Integer> maiorElementos = new ArrayList<>();
		
		if(n <= 10) {
			mat = new int[n][n];
		}
		
		System.out.println();
		for (int i = 0; i < mat.length; i++) {
			
			int comparador = 0;
			
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
				
				if(mat[i][j] > comparador) {
					comparador = mat[i][j];
				}
			}
			
			maiorElementos.add(comparador);
		}
		
		System.out.println("Maior elemento de cada linha: ");
		for (Integer i : maiorElementos) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
