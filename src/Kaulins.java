import java.util.Random;

public class Kaulins {
	
	static void mestKaulinu() {
		int sk;
		Random rand = new Random();
		sk = rand.nextInt(6)+1;
		System.out.println("Tu uzmeti: "+sk);
	}
	public static void main(String[] args) {
		mestKaulinu();
	}

}
