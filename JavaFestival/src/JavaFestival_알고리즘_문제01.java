import java.util.Scanner;

public class JavaFestival_�˰���_����01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ������ : ");
		int now = sc.nextInt();
		System.out.print("��ǥ ������ : ");
		int goal = sc.nextInt();

		int week = 1;
		do {
			System.out.print(week++ + "���� ���� ������ : ");
			int loss = sc.nextInt();
			now = now - loss;
		} while (now >= goal);
		{
			System.out.println(now + "kg �޼�!! �����մϴ�!!");
		}

	}

}
