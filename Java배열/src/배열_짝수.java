import java.util.Random;

public class �迭_¦�� {

	public static void main(String[] args) {

		Random rd = new Random();

		int[] array1 = new int[10];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = rd.nextInt(100);
		}
		System.out.print("array�� ��� �ִ� ¦���� ");

		for (int i = 0; i < array1.length; i++) {

			if (array1[i] % 2 == 0)
				
			{

				System.out.print(array1[i] + " ");

			}

		}
		System.out.print(" �Դϴ�.");

	}
}