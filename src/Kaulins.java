import java.util.Random;

public class Kaulins {
	
	static void mestKaulinu(int reizes) {
		int sk;
		Random rand = new Random();
		for(int i=0;i<reizes;i++) {
		sk = rand.nextInt(6)+1;
		System.out.println("Tu uzmeti: "+sk);
		}
	}
	public static void main(String[] args) {
		mestKaulinu(5);
	}

}
