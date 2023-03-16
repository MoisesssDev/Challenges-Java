package Poo.desafio4.entities;

public class Student {
	public double primeiroTrimestre;
	public double segundoTrimestre;
	public double terceiroTrimestre;
	
	public double calculoNotaFinal() {
		return this.primeiroTrimestre + this.segundoTrimestre + this.terceiroTrimestre;
	}
	
	public boolean validaAprovacao() {		
		if(calculoNotaFinal() >= 60) {
			return true;
		} else {
			return false;
		}
	}
	
	public String aprovacao() {
		if(validaAprovacao()) {
			return "Parabens voce passou!!!!";
		}else {
			pontosParaPassar();
			return "Voce esta reprovado!!";
		}
	}
	
	public void pontosParaPassar() {
		double pontosParaPassar = 60 - calculoNotaFinal();
		System.out.printf("Faltaram %.2f pontos%n", pontosParaPassar);
	}
	
}
