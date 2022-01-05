import java.util.Scanner;

public class 이차원배열03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] answer = {{4,5,4,1,2,}, {0,0,0,0,0}, {10,20,30,20,20}};

		int num1 = 0;


		for (int i = 0; i < answer[0].length; i++) {
			System.out.print((i + 1) + "번째 답 : ");
			answer[1][i] = sc.nextInt();
		}

		for (int i = 0; i < answer[0].length; i++) {
			if (answer[0][i] == answer[1][i]) {
				System.out.print("o ");
				num1 += answer[2][i];
			} else {
				System.out.print("x ");
			}

		}
		System.out.println("\n" + num1);

	}
}
