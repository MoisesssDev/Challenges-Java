package EstruturasRepetitivas;

import java.util.Scanner;

/**
 * Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10.
 */

public class desafio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Deseja a tabuada para qual valor? ");
		int N = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(N + " X " + i + " = " + N * i);
		}

		sc.close();
	}

}
