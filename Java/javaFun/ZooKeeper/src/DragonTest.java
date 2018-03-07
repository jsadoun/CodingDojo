
public class DragonTest {
	public static void main(String[] args) {
		Dragon puff = new Dragon();
	
		puff.attackTown();
		puff.attackTown();
		puff.attackTown();
		puff.displayEnergy();
		System.out.println("******");
		puff.eatHumans();
		puff.eatHumans();
		puff.displayEnergy();
		System.out.println("******");
		puff.fly();
		puff.fly();
		puff.displayEnergy();
	}
}

//attack three towns, eat two humans, and fly twice.