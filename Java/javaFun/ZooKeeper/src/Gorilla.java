
public class Gorilla extends Mammal {
	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("Monkey threw Shit!");
	}
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("Monkey eats banana");
	}
	public void climb() {
		energyLevel -= 10;
		System.out.println("Monkey climbs a tree!");
	}
}
