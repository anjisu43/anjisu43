import java.util.Scanner;

public class 문제15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		int n = 1;
		
		for(int i = 0; i < num; i++) {
			
			n +=i;
			
			System.out.print(n +" ");
		}

	}

}
