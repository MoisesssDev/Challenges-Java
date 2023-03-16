package Poo.desafio4.application;

import java.util.Locale;
import java.util.Scanner;

import Poo.desafio4.entities.Student;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student estudante = new Student();
		
		estudante.primeiroTrimestre = sc.nextDouble();
		estudante.segundoTrimestre = sc.nextDouble();
		estudante.terceiroTrimestre = sc.nextDouble();
		
		System.out.println(estudante.aprovacao());
		
		
		sc.close();
	}
}
