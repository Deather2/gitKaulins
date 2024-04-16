import java.util.Random;
import java.util.Scanner;

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
		int r;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ievadi cik reizes mest kaulinu?");
		r = scan.nextInt();
		mestKaulinu(r);
	}

}
