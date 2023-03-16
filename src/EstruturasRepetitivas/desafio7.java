package EstruturasRepetitivas;

import java.util.Scanner;

/**
 * Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre
 * a soma dos números impares entre eles.
 */

public class desafio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y,contador, somaImpares = 0;

		System.out.println("Digite dois numeros: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(y < x) {
			contador = y;
			y = x;
			x = contador;		
		}

		for (int i = x + 1; i < y; i++) {
			if (i % 2 != 0) {
				somaImpares += i;
			}
		}

		System.out.println("SOMA IMPARES: " + somaImpares);

		sc.close();
	}
}
