import java.util.Random;
import java.util.Scanner;

public class PlusGame {

	public static void main(String[] args) {

		// 1~100������ ���� 2���� �̾� ������ �ϴ� ������ ������.
		// ����� ���ÿ� ���� ���� or ���� ������ �ǵ��� �غ���
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		String YesOrNo;
		do {
			System.out.print("1.���� 2.���� >> ");
			int choice = sc.nextInt();

			int num1 = random.nextInt(100) + 1;
			int num2 = random.nextInt(100) + 1;
			
			int answer=0;

			if (choice == 1) {
				System.out.println(num1 + "+" + num2 + "=");
				int input = sc.nextInt();
				answer = num1+num2;
				if(answer==input) {
					System.out.println("����");
				}
				else { 
					System.out.println("����");
				}
				
			}else if(choice == 2) {
				System.out.print(num1 + "-" + num2 + "=");
				int input = sc.nextInt();
				answer = num1-num2;
				if(answer==input) {
					System.out.println("����");
				}
				else { 
					System.out.println("����");
				}
			}

			System.out.print("��� �Ͻðڽ��ϱ�?(Y/N) : ");
			YesOrNo = sc.next();
		} while (YesOrNo.equals("Y") || YesOrNo.equals("y"));

	}
}
