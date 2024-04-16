import java.util.Random;
import java.util.Scanner;

public class Kaulins {

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
	}

}
