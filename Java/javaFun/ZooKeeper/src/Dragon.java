
public class Dragon {
	public int energyLevel = 300;
	
	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
	public void fly() {
		energyLevel-=50;
		System.out.println("Puff got high");
	}
	public void eatHumans() {
		energyLevel+=25;
		System.out.println("Puff ate somebody!");
	}
	public void attackTown() {
		energyLevel-=100;
		System.out.println("Puff destroyed a town!!");
	}
}
