import java.util.Random;

public class 배열_짝수 {

	public static void main(String[] args) {

		Random rd = new Random();

		int[] array1 = new int[10];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = rd.nextInt(100);
		}
		System.out.print("array에 들어 있는 짝수는 ");

		for (int i = 0; i < array1.length; i++) {

			if (array1[i] % 2 == 0)
				
			{

				System.out.print(array1[i] + " ");

			}

		}
		System.out.print(" 입니다.");

	}
}