import java.util.Scanner;

public class 반복문02 {

	public static void main(String[] args) {

		// 10보다 작은 수를 입력한다면 반복
		// 10보다 큰 수를 입력한다면 종료

		System.out.print("숫자입력 : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		while (true) {
			System.out.print("숫자입력 : ");
			i = sc.nextInt();
			
			if(i>10) {
				break;
			}
		}
		System.out.println("종료되었습니다.");

	}

}
