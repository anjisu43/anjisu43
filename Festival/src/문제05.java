import java.util.Scanner;

public class 문제05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수  :");
		int star = sc.nextInt();
		for(int i = 0 ; i<=star; i++) {
		  for(int a = 0; a<i; a++) {
			System.out.print("*");
		  }
		  System.out.println();
		}

	}

}
