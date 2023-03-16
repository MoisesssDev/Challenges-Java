package EstruturasSequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar
 * uma mensagem com os nomes e a idade média entre essas pessoas, com uma casa
 * decimal, conforme exemplo.
 */

public class desafio3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Dados da primeira pessoa:");

			System.out.print("Nome: ");
			String nome1 = scan.nextLine();

			System.out.print("Idade: ");
			int idade1 = scan.nextInt();

			scan.nextLine();

			System.out.println("Dados da segunda pessoa:");

			System.out.print("Nome: ");
			String nome2 = scan.nextLine();

			System.out.print("Idade: ");
			int idade2 = scan.nextInt();

			double mediaIdade = (idade1 + idade2) / 2;

			System.out.println("A idade média de " + nome1 + " e " + nome2 + " é de " + mediaIdade);
		}

	}
}
