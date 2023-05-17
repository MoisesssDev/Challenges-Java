package exceptions.application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		metodo1();
		System.out.println("Fim do programa.");

		
	}
	
	public static void metodo1() {
		System.out.println("*****METODO 1 START******");
		metodo2();
		System.out.println("*****METODO 1 END******");
	}
	
	public static void metodo2() {
		System.out.println("*****METODO 2 START******");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();

			System.out.println(vect[position]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
		}

		catch (InputMismatchException e) {
			System.out.println("Input error!");
		}
		
		sc.close();
		System.out.println("*****METODO 2 END******");
	}
}
