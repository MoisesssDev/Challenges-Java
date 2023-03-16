package Poo.desafio1.application;

import java.util.Locale;
import java.util.Scanner;

import Poo.desafio1.entities.Triangulo;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
//		Inicializacao da entidade
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
//		Entrada de dados
		System.out.println("Dados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Dados do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
//		Chamando o metodo que vai executar a formula da area do triangulo
		double areaX = x.area();
		
		double areaY = y.area();
		
//		Output
		System.out.printf("Triangulo X area: %.4f%n", areaX);
		System.out.printf("Triangulo Y area: %.4f%n", areaY);
		
//		Comparacao da maior largura
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}
}
