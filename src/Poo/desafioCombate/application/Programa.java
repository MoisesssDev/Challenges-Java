package Poo.desafioCombate.application;

import java.util.Locale;
import java.util.Scanner;

import Poo.desafioCombate.entities.Champion;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Champion champion0 = null, champion1 = null;
		
		for(int i = 0; i < 2; i++) {
			
			if(i != 0) {
				System.out.println("Digite os dados do segundo campeao:");
			}else {
				System.out.println("Digite os dados do primeiro campeao: ");
			}
			
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Vida inicial: ");
			int life = sc.nextInt();
			System.out.print("Ataque: ");
			int attack = sc.nextInt();
			System.out.print("Armadura: ");
			int armor = sc.nextInt();
			System.out.println();
			
			if(i != 0) {
				champion1 = new Champion(name, life, attack, armor);
			}else {
				champion0 = new Champion(name, life, attack, armor);
			}
	
		}
		
		System.out.print("Quantos turnos voce deseja executar? ");
		int turnos = sc.nextInt();
		System.out.println();
		
		for(int i = 1; i <= turnos; i++) {
			
			if(champion0.getLife() == 0 | champion1.getLife() == 0) {
				break;
			} else {
				champion0.takeDamage(champion1);
				champion1.takeDamage(champion0);
				
				System.out.println("Resultado do turno: " + i);
				System.out.println(champion0.getName() + " : " + champion0.status());
				System.out.println(champion1.getName() + " : " + champion1.status());
				System.out.println();
			}
			
		}
		
		System.out.println("FIM DO COMBATE");
		
		sc.close();
	}
}
