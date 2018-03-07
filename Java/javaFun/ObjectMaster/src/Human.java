
public class Human {
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	public int health = 100;

	public void attack(Human human){
		human.health -= this.strength;
		
		System.out.println("This should be Jacob's health: "+human.health);
		System.out.println("This should be Spencer's health: "+this.health);
		
	}
}
