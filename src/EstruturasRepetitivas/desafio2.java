package EstruturasRepetitivas;

import java.util.Scanner;

/**
 * Faça um programa para ler um número indeterminado de dados, contendo cada um,
 * a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém
 * um valor de idade negativa. Calcular e imprimir a idade média deste grupo de
 * indivíduos. Se for entrado um valor negativo na primeira vez, mostrar a
 * mensagem "IMPOSSIVEL CALCULAR"
 */

public class desafio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade = 0, somaIdades = 0, contador = 0;
		double media;

		System.out.println("Digite as idades: ");
		while (idade >= 0) {
			idade = scan.nextInt();

			if (idade > 0) {
				somaIdades += idade;
			} else if (somaIdades == 0) {
				System.out.println("IMPOSSIVEL DE CALCULAR");
			} else {
				media = somaIdades / contador;
				System.out.println("MEDIA = " + media);
			}

			contador++;
		}

		scan.close();
	}
}
