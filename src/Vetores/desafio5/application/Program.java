package Vetores.desafio5.application;

import java.util.Locale;
import java.util.Scanner;

import Vetores.desafio5.entities.Pessoa;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Pessoa[] vect = new Pessoa[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println();
			System.out.print("nome:");
			String name = sc.next();
			System.out.print("idade:");
			int age = sc.nextInt();
			System.out.print("altura:");
			double height = sc.nextDouble();
			
			vect[i] = new Pessoa(name, age, height);
		}
		
		System.out.println();
		System.out.printf("Altura media: %.2f%n", p.mediaAltura(vect));
		System.out.printf("Pessoas com menos de 16: %.2f%%%n", p.pessoasMenor16Anos(vect));
		for (Pessoa pessoa : vect) {
			if(pessoa.getAge() < 16) {
				System.out.println(pessoa.getName());
			}
		}
		
		sc.close();
	}
}
