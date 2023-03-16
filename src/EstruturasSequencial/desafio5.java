package EstruturasSequencial;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler o valor "r" do raio de um círculo, e depois
 * mostrar o valor da área do círculo com três casas decimais. A fórmula da área
 * do círculo é a seguinte: 𝑎𝑟𝑒𝑎 = 𝜋. 𝑟ଶ. Você pode usar o valor de 𝜋
 * fornecido pela biblioteca da sua linguagem de programação, ou então, se
 * preferir, use diretamente o valor 3.14159.
 */

public class desafio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner scan = new Scanner(System.in)) {
			DecimalFormat df = new DecimalFormat("#.###");

			System.out.print("Digite o valor do raio do circulo: ");
			double raio = scan.nextDouble();

			double area = Math.PI * Math.pow(raio, 2);

			String areaFormated = df.format(area);

			System.out.println("AREA = " + areaFormated);
		}

	}
}
