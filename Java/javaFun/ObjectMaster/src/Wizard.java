
public class Wizard extends Human{
	public Wizard() {
		super();
			this.health = 50;
			this.intelligence = 8;
	}

	public void heal(Human human){
		human.health += this.intelligence;
		System.out.println("Wizard healed somebody! ."+human.health);

	}
	
	public void fireball(Human human) {
		human.health += (this.intelligence*3);
		System.out.println("Wizard threw a fireball! "+human.health);

	}
	
}
