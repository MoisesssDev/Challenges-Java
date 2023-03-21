package List.desafio1.application;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Fernando");
		list.add("Ricardo");
		list.add("Jose");
		list.add("Luiza");
		list.add("Marcos");
		
		list.add(2, "Luis"); // adiciona na posição 2
		
		System.out.println("Tamanho da lista:");
		System.out.println(list.size());
		System.out.println();
		
		
		System.out.println("Todos os nomes da Lista:");
		for (String name : list) {
			System.out.println(name);
		}
		
		list.remove("Jose"); // remove Jose da lista
		
		System.out.println();
		System.out.println("Lista sem Jose:");
		for (String name : list) {
			System.out.println(name);
		}
		
		list.removeIf(x -> x.charAt(0) == 'M'); // remove todos que começam com 'M'
		System.out.println();
		System.out.println("Lista com nomes sem a inicial 'M':");
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println();
		System.out.println("Index de Luiza: " + list.indexOf("Luiza")); // Descobrir o index
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').toList(); //filtrando a lista
		System.out.println();
		System.out.println("Lista com nome que iniciam com 'L'");
		for (String name : result) {
			System.out.println(name);
		}
		
		String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null); //Filtra um nome
		System.out.println();
		System.out.println("Primeiro nome com 'L': ");
		System.out.println(name);
	}
}
