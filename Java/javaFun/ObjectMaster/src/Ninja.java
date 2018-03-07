
public class Ninja extends Human{
	public Ninja() {
		super();
			this.stealth = 10;
	}
	
	public void steal(Human human) {
		human.health -= this.stealth;
		this.health += this.stealth;
		System.out.println("Ninja stole a human! "+human.health);

	}
	
	public void runaway() {
		this.health -=10;
		System.out.println("Ninja ran away! "+this.health);
	}
}