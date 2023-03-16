package EstruturasSequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a)
 * recebe por hora, e a quantidade de horas trabalhadas por ele(a). Ao final,
 * mostrar o valor do pagamento do funcionário com uma mensagem explicativa,
 * conforme exemplo.
 */

public class desafio6 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Nome: ");
			String nome = scan.nextLine();

			System.out.print("Valor por hora: ");
			double valorPorHora = scan.nextDouble();
			
			System.out.print("Horas trabalhadas: ");
			int horasTrabalhadas = scan.nextInt();
			
			double pagamento = horasTrabalhadas * valorPorHora;


			System.out.println("O pagamento para " + nome + " deve ser de " + pagamento);
		}

	}
}
