package EstruturasSequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para calcular o troco no processo de pagamento de um
 * produto de uma mercearia. O programa deve ler o preço unitário do produto, a
 * quantidade de unidades compradas deste produto, e o valor em dinheiro dado
 * pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
 * mostrar o valor do troco a ser devolvido ao cliente.
 */

public class desafio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Preço unitario do produto : ");
			double precoUnitario = scan.nextDouble();

			System.out.print("Quantidade comprada: ");
			int quantidade = scan.nextInt();

			double valorTotal = precoUnitario * quantidade;

			System.out.println("Dinheiro recebido: ");
			double dinheiroRecebido = scan.nextDouble();

			if (dinheiroRecebido < (valorTotal)) {
				System.out.println("O dinheiro é insuficiente ");
			} else {
				double troco = (valorTotal - dinheiroRecebido) * -1;

				System.out.println("TROCO = " + troco);
			}
		}

	}
}
