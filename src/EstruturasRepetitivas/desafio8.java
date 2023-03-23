package EstruturasRepetitivas;

import java.util.Scanner;

/**
 * A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série
 * de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, é igual à
 * soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e
 * mostre os N primeiros números dessa série.
 */
public class desafio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int proximo, anterior = 0, atual = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(anterior + " "); // 1
			proximo = anterior + atual; // 2
			atual = anterior;// 1
			anterior = proximo; // 1

		}

		sc.close();
	}
}
