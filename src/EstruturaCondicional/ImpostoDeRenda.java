package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ImpostoDeRenda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		/**
		 * Input
		 * */
		double porcentagemImpostoSalario, porcentagemImpostoPrestacaoServico, porcentagemImpostoGanhoCapital;

		System.out.print("Renda anual com salário: ");
		double rendaAnualSalario = scan.nextDouble();

		System.out.print("Renda anual com prestação de serviço: ");
		double rendaAnualPrestacaoServico = scan.nextDouble();

		System.out.print("Renda anual com ganho de capital: ");
		double rendaAnualGanhoCapital = scan.nextDouble();

		System.out.print("Gastos médicos: ");
		double gastosMedicos = scan.nextDouble();

		System.out.print("Gastos educacionais: ");
		double gastosEducacionais = scan.nextDouble();

		System.out.println();
		for (int i = 0; i < 30; i++) {
			System.out.print("---");
		}
		System.out.println();

		/**
		 * Imposto sobre sálario
		 */
		double salarioMensal = rendaAnualSalario / 12;

		if (salarioMensal > 5000) {
			porcentagemImpostoSalario = 0.20;
		} else if (salarioMensal < 5000 && salarioMensal > 3000) {
			porcentagemImpostoSalario = 0.10;
		} else {
			porcentagemImpostoSalario = 0.0;
		}

		/**
		 * Imposto sobre serviço
		 */
		if (rendaAnualPrestacaoServico != 0) {
			porcentagemImpostoPrestacaoServico = 0.15;
		} else {
			porcentagemImpostoPrestacaoServico = 0.0;
		}
		
		/**
		 * Imposto sobre ganho capital
		 * */
		if (rendaAnualGanhoCapital != 0) {
			porcentagemImpostoGanhoCapital = 0.20;
		} else {
			porcentagemImpostoGanhoCapital = 0.0;
		}
		
		/**
		 * impostos gerais
		 * */
		double impostoSalario = rendaAnualSalario * porcentagemImpostoSalario;
		double impostoServico = rendaAnualPrestacaoServico * porcentagemImpostoPrestacaoServico;
		double impostoGanhoCapital = rendaAnualGanhoCapital * porcentagemImpostoGanhoCapital;
		double impostoBruto = impostoSalario + impostoGanhoCapital + impostoServico;
		double maximoDedutivel = impostoBruto * 0.30;
		double abatimento;
		
		/**
		 * deduções
		 * */
		double gastosDedutivel = gastosEducacionais + gastosMedicos;
		if(gastosDedutivel >= maximoDedutivel) {
			abatimento = maximoDedutivel;
		} else {
			abatimento = gastosDedutivel;
		}
		
		/**
		 * IMPOSTO DEVIDO FINAL 
		 * */
		double impostoDevido = impostoBruto - abatimento;
		
		
		/**
		 * Output
		 * */
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.println("Imposto sobre salário: " + impostoSalario);
		System.out
				.println("Imposto sobre serviços: " + impostoServico);
		System.out.println("Imposto sobre ganho capital: " + impostoGanhoCapital);
		System.out.println();
		System.out.println("DEDUÇÕES:");
		System.out.println("Máximo dedutível: " + maximoDedutivel);
		System.out.println("Gastos dedutíveis: " + gastosDedutivel);
		System.out.println();
		System.out.println("RESUMO");
		System.out.println("Imposto bruto total: " + impostoBruto);
		System.out.println("Abatimento: " + abatimento);
		System.out.println("Imposto devido: " + impostoDevido);
		
		

		scan.close();
	}

}
