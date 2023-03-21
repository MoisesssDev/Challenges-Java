package Poo.desafioCombate.entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;

	public Champion(String name, int life, int attack, int armor) {
		super();
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		if(this.life < 0) {
			this.life = 0;
		}
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public void takeDamage(Champion otherChampion) {
		if (otherChampion.attack < this.armor) {
			this.life--;
		} else {
			this.life -= otherChampion.attack - this.armor;
		}
	}

	public String status() {
		String finalGame = null;

		if (this.life <= 0) {
			finalGame = "morreu";
			return finalGame;
		} else {
			finalGame = this.life + " de vida";
			return finalGame;
		}
	}

}
