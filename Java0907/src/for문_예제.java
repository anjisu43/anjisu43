import java.util.Scanner;

public class for��_���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int i = sc.nextInt();
		
		System.out.print(i+"�� ��� : ");

		for (int a = 1; a < i; a++) {

			if (i % a == 0) {

				System.out.print(a+" ");
			}

		}

	}

}
