import java.util.Random;
import java.util.Scanner;

public class Kaulins {


	
	static void mestKaulinu(int reizes) {
		int sk,lielakais=0;
		Random rand = new Random();
		for(int i=0;i<reizes;i++) {
		sk = rand.nextInt(6)+1;
		System.out.println("Tu uzmeti: "+sk);
		if(lielakais<sk)
			lielakais=sk;
		}
		System.out.println("Lielākais no visiem metienim: "+lielakais);
	}
	public static void main(String[] args) {
		int r;
		Scanner scan = new Scanner(System.in);
		do {
		System.out.println("Ievadi cik reizes mest kaulinu?");
		r = scan.nextInt();
		}while(r<1);
		mestKaulinu(r);
		scan.close();
	}

}
