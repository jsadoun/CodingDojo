
import java.util.ArrayList;

public class Samurai extends Human{
	public ArrayList<Samurai> samArray =  new ArrayList<Samurai>();
	public Samurai() {
		super();
		this.health = 200;
	}
	public void deathBlow(Human human) {
		human.health =0;
		this.health /=2;
		System.out.println("Samurai killed a human! "+human.health);
	}
	
	public void meidate() {
		this.health *= 1.5; 
		System.out.println("Samurai mediated himself to  "+this.health);
	}
	
	public void add(Samurai sammy) {
		samArray.add(sammy);
	}
	
	public void howMany() {
		System.out.println("This is how many Samurai: "+samArray.size());
	}
}
