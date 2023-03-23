package Vetores.desafio5.entities;

public class Pessoa {
	private String name;
	private int age;
	private double height;

	public Pessoa() {
	}

	public Pessoa(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double mediaAltura(Pessoa[] pessoas) {
		double soma = 0.0;

		for (Pessoa pessoa : pessoas) {
			soma += pessoa.height;
		}

		return soma / pessoas.length;
	}

	public double pessoasMenor16Anos(Pessoa[] pessoas) {
		int contador = 0;

		for (Pessoa pessoa : pessoas) {
			if (pessoa.age < 16) {
				contador++;
			}
		}

		return (contador * 100) / pessoas.length;
	}
}
