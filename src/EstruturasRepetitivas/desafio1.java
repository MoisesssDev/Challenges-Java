package EstruturasRepetitivas;

import java.util.Scanner;

/**
 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
 * Escreva para cada X e Y uma mensagem que indique se estes valores foram
 * digitados em ordem crescente ou decrescente. O programa deve finalizar quando
 * forem digitados dois valores iguais
 */

public class desafio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2;

		System.out.println("Digite dois numeros:");
		n1 = scan.nextInt();
		n2 = scan.nextInt();

		if (n1 < n2) {
			System.out.println("CRESCENTE!!");
		} else if (n1 > n2) {
			System.out.println("DECRESCENTE!!");
		}

		while (n1 != n2) {
			System.out.println("Digite outros dois numeros:");
			n1 = scan.nextInt();
			n2 = scan.nextInt();

			if (n1 < n2) {
				System.out.println("CRESCENTE!!");
			} else if (n1 > n2) {
				System.out.println("DECRESCENTE!!");
			}
		}

		scan.close();

	}
}
