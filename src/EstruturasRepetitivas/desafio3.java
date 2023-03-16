package EstruturasRepetitivas;

import java.util.Scanner;

/**
 * Escreva um programa que repita a leitura de uma senha até que ela seja
 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
 * "Senha Invalida! Tente novamente:". Quando a senha for informada corretamente
 * deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
 * Considere que a senha correta é o valor 2002.
 */

public class desafio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int senha = 2002;
		int tentativa;

		System.out.print("Digite a senha: ");
		tentativa = scan.nextInt();

		while (tentativa != senha) {
			System.out.print("Senha invalida! Tente novamente: ");
			tentativa = scan.nextInt();
		}

		System.out.println("Acesso permitido!");

		scan.close();
	}
}
