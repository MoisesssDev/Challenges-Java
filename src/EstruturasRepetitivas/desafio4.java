package EstruturasRepetitivas;

import java.util.Scanner;

/**
 * Um posto de combustíveis deseja determinar qual de seus produtos tem a
 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
 * será encerrado quando o código informado for o número 4, devendo então
 * mostrar a mensagem "MUITO OBRIGADO", bem como as quantidades de cada
 * combustível.
 */

public class desafio4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int qntdGasolina = 0, qntdAlcool = 0, qntdDiesel = 0;
		int contador = 0;
		
		while(contador != 4) {
			System.out.print("Informe um codigo(1- ALCOOL / 2- GASOLINA / 3- DIESEL) ou 4 para cancelar: ");
			contador = scan.nextInt();
			
			switch (contador) {
			case 1:
				qntdAlcool++;
				break;
			case 2:
				qntdGasolina++;
				break;
			case 3:
				qntdDiesel++;
				break;
			case 4:
				System.out.println("MUITO OBRIGADO");
			default :
				break;
			}
		}
		
		System.out.println("Alcool: " + qntdAlcool);
		System.out.println("Gasolina: " + qntdGasolina);
		System.out.println("Diesel: " + qntdDiesel);
		
		scan.close();
	}
}
