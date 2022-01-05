import java.util.Scanner;

public class for문_예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int i = sc.nextInt();
		
		System.out.print(i+"의 약수 : ");

		for (int a = 1; a < i; a++) {

			if (i % a == 0) {

				System.out.print(a+" ");
			}

		}

	}

}
