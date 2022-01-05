
import java.util.Scanner;

public class 보너스04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] star = new int[5];
		
		for(int i = 0; i<star.length; i++) {
			System.out.print(i+"번째 별의 수 : ");
			star[i] = sc.nextInt();
		
		}
		for(int i = 0; i<star.length; i++) {
			System.out.print(star[i]+":");
			for(int a = 0; a<star[i]; a++ ) {
				System.out.print("*");
			}System.out.println();
			
		}

	}

}
