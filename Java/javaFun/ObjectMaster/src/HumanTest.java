
public class HumanTest {
	public static void main(String[] args) {
		Human spencer = new Human();
		Human jacob = new Human();
		
		spencer.attack(jacob);
		
		
		Samurai sam1 = new Samurai();
		Samurai sam2 = new Samurai();
		Samurai sam3 = new Samurai();
		Samurai sam4 = new Samurai();
		
		sam1.add(sam1);
		sam1.add(sam2);
		sam1.add(sam3);
		sam1.add(sam4);
		
		sam1.howMany();
		
	}

}
