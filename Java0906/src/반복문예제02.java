
public class �ݺ�������02 {

	public static void main(String[] args) {
		// 1~20���� ���ڸ� ����غ���.
		// Ȧ���� ����� ����� �ϰ�, ¦���� ������ ��� �غ��ô�

		for (int i = 1; i <= 20; ++i) {
			System.out.print(i % 2 == 0 ? -i : i);
			System.out.print(" ");}
			System.out.println();
		for (int i = 1; i <= 20; ++i) {	

			if (i % 2 == 0) {
				System.out.print(-i + " ");
			} else {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		for (int even = 2, odd = 1; even <= 20; even += 2, odd += 2) {
			System.out.print(odd + " " + -even + " ");
		}
		System.out.println();

		int i = 0;
		while (i < 20) {
			i++;
			if (i % 2 == 0) {
				System.out.print(i + " ");
			} else {
				System.out.print(-i + " ");

			}

		}
	}

}
