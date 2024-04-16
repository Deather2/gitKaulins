import java.util.Random;
import java.util.Scanner;

public class Kaulins {
<<<<<<< HEAD

	public static void main(String[] args) {
		int sk, r;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Ievadi cik reizes mest kaulinu?");
		r = scan.nextInt();
		for(int i=0;i<r;i++) {
		sk = rand.nextInt(6)+1;
		System.out.println("Tu uzmeti: "+sk);
		}
		scan.close();
=======
	
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
>>>>>>> idejuZars
	}

}
