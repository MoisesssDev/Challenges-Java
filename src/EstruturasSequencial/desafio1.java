package EstruturasSequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler as medidas da largura e comprimento de um terreno
 * retangular com uma casa decimal, bem como o valor do metro quadrado do
 * terreno com duas casas decimais. Em seguida, o programa deve mostrar o valor
 * da área do terreno, bem como o valor do preço do terreno, ambos com duas
 * casas decimais, conforme exemplo.
 */

public class desafio1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite a largura do terreno: ");
			double largura = scanner.nextDouble();

			System.out.print("Digite o comprimento do terreno: ");
			double comprimento = scanner.nextDouble();

			System.out.print("Digite o valor do metro quadrado: ");
			double valorMetroQuadrado = scanner.nextDouble();

			double areaDoTerreno = largura * comprimento;
			System.out.println("Area do terreno = " + areaDoTerreno);

			double precoTerreno = areaDoTerreno * valorMetroQuadrado;
			System.out.println("Preco terreno = " + precoTerreno);
		}
	}
}
