import java.util.Scanner;

public class Dowhile02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��������� : ");
		int nowKg = sc.nextInt();

		System.out.print("��ǥ������ : ");
		int wantKg = sc.nextInt();

		int week = 1;
		do {
			System.out.print(week++ + "���� ���� ������ : ");
			int lossKg = sc.nextInt();
			nowKg = nowKg - lossKg;

		} while (nowKg >= wantKg);
		System.out.println(nowKg + "�޼�!! �����մϴ�!");

	}
}
