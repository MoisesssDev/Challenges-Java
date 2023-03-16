package EstruturasSequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler as medidas da base e altura de um retângulo. Em
 * seguida, mostrar o valor da área, perímetro e diagonal deste retângulo, com
 * quatro casas decimais, conforme exemplos.
 */

public class desafio2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Base do retangulo: ");
			double base = scan.nextDouble();

			System.out.print("Altura do retangulo: ");
			double altura = scan.nextDouble();

			double areaRetangulo = base * altura;
			System.out.println("AREA = " + areaRetangulo);

			double perimetro = 2 * (base + altura);
			System.out.println("PERIMETRO = " + perimetro);

			double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
			System.out.println("DIAGONAL = " + diagonal);
		}
	}
}
