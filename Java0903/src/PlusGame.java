import java.util.Random;
import java.util.Scanner;

public class PlusGame {

	public static void main(String[] args) {

		// 1~100사이의 난수 2개를 뽑아 덧셈을 하는 게임을 만들어보자.
		// 사용자 선택에 따라 덧셈 or 뺄셈 게임이 되도록 해보자
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		String YesOrNo;
		do {
			System.out.print("1.덧셈 2.뺄셈 >> ");
			int choice = sc.nextInt();

			int num1 = random.nextInt(100) + 1;
			int num2 = random.nextInt(100) + 1;
			
			int answer=0;

			if (choice == 1) {
				System.out.println(num1 + "+" + num2 + "=");
				int input = sc.nextInt();
				answer = num1+num2;
				if(answer==input) {
					System.out.println("성공");
				}
				else { 
					System.out.println("실패");
				}
				
			}else if(choice == 2) {
				System.out.print(num1 + "-" + num2 + "=");
				int input = sc.nextInt();
				answer = num1-num2;
				if(answer==input) {
					System.out.println("성공");
				}
				else { 
					System.out.println("실패");
				}
			}

			System.out.print("계속 하시겠습니까?(Y/N) : ");
			YesOrNo = sc.next();
		} while (YesOrNo.equals("Y") || YesOrNo.equals("y"));

	}
}
