package Lista.desafioConribuintesOO.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Lista.desafioConribuintesOO.entities.TaxPayer;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();
		
		List<TaxPayer> contribuintes = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Digite os dados do " + i + "o contribuinte:");
			
			System.out.print("Renda anual com salário: ");
			double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestacao de servico: ");
			double serviceIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalIncome = sc.nextDouble();
			System.out.print("Gastos medicos: ");
			double healthSpeding = sc.nextDouble();
			System.out.print("Gastos educacionais:");
			double educationSpending = sc.nextDouble();
			
			contribuintes.add(new TaxPayer(salaryIncome, serviceIncome, capitalIncome, healthSpeding, educationSpending));
		}
		
		for (TaxPayer taxPayer : contribuintes) {
			int contador = 1;
			System.out.println();
			System.out.println("Resumo do " + contador + "o contribuinte:");
			
			System.out.printf("Imposto bruto total: %.2f%n", taxPayer.grossTax());
			System.out.printf("Abatimento: %.2f%n", taxPayer.taxRebate());
			System.out.printf("Imposto devido: %.2f%n", taxPayer.netTax());
		}
		

		sc.close();
	}
}
