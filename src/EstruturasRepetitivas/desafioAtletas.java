package EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class desafioAtletas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String atletaMaisAlto = null;
		double pesoMedioAtletas, alturaMediaMulhres, alturaComparativo = 0, somaPesoAtletas = 0,
				porcentagemHomens = 0.0, somaAlturaFeminina = 0.0, atletasMasculinos = 0.0, atletasFeminina = 0.0;

		System.out.print("Qual a quantidade de atletas? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			String nome, sexo;
			double peso, altura;

			// QUEBRA DE LINHA
			sc.nextLine();

			System.out.println("Digite os dados do atleta " + i + ":");
			// NOME
			System.out.print("Nome: ");
			nome = sc.nextLine();

			// SEXO
			System.out.print("Sexo: ");
			sexo = sc.next();

			// VALIDAÇÃO DO SEXO
			while (!sexo.equals("F") && !sexo.equals("M")) {
				System.out.print("Valor invalido! Favor digitar F ou M: ");
				sexo = sc.next();
			}
			switch (sexo) {
			case "M":
				atletasMasculinos++;
				break;
			case "F":
				atletasFeminina++;
				break;
			default:
				break;
			}
			// ALTURA
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			// VALIDAÇÃO DA ALTURA
			while (altura < 1.0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				altura = sc.nextDouble();
			}

			// PESO
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			// VALIDAÇÃO DA PESO
			while (peso < 1.0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				peso = sc.nextDouble();
			}

			// PESO MEDIO DOS ATLETAS
			somaPesoAtletas += peso;

			// ATLETA MAIS ALTO
			if (altura > alturaComparativo) {
				atletaMaisAlto = nome;
				alturaComparativo = altura;
			}

			// PORCENTAGEM DE HOMENS
			porcentagemHomens = (atletasMasculinos / n) * 100;

			// ALTURA MEDIA DAS MULHERES
			// PEGANDO A ALTURA DAS ATLETAS DO SEXO FEMININO
			if (sexo.equals("F")) {
				somaAlturaFeminina += altura;
			}
			

		}
		// PESO MEDIO DOS ATLETAS
		pesoMedioAtletas = somaPesoAtletas / n;

		// ALTURA MEDIA DAS MULHERES
		alturaMediaMulhres = somaAlturaFeminina / atletasFeminina;

		// OUTPUT
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedioAtletas);
		System.out.println("Atleta mais alto: " + atletaMaisAlto.toUpperCase());
		System.out.printf("Porcentagem de homens: %.1f%%%n", porcentagemHomens);
		//VALIDANDO SE HA ATLETAS MASCULINO OU FEMININO
		if(atletasFeminina == 0) {
			System.out.println("Nao ha mulheres cadastradas");
		}else {
			System.out.println("Altura média das mulheres: " + alturaMediaMulhres);
		}

		sc.close();
	}
}
