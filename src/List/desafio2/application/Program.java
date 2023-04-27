package List.desafio2.application;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		var list = new ArrayList<String>();
		var list2 = new ArrayList<String>();
		
		
		list.add("Fernando");
		list.add("Carlos");
		
//		System.out.println("VETOR LISTA 1:");
//		System.out.println(list.clone());
		
		list2.add("Joao");
		
	
		System.out.println("LISTA 1:");
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println();
		
		
		System.out.println("LISTA 2:");
		for (String name : list2) {
			System.out.println(name);
		}
	}
}
