package Poo.desafio3.application;

import java.util.Locale;
import java.util.Scanner;

import Poo.desafio3.entities.Rectangle;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		var retangulo = new Rectangle();
		
		System.out.println("Entre com a largura e altura do triangulo:");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("PERIMETRO = %.2f%n", retangulo.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
		
		sc.close();
	}
}
