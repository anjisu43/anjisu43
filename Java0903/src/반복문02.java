import java.util.Scanner;

public class �ݺ���02 {

	public static void main(String[] args) {

		// 10���� ���� ���� �Է��Ѵٸ� �ݺ�
		// 10���� ū ���� �Է��Ѵٸ� ����

		System.out.print("�����Է� : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		while (true) {
			System.out.print("�����Է� : ");
			i = sc.nextInt();
			
			if(i>10) {
				break;
			}
		}
		System.out.println("����Ǿ����ϴ�.");

	}

}
