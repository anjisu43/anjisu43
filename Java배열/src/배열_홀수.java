import java.util.Random;

public class �迭_Ȧ�� {

	public static void main(String[] args) {
		Random rd = new Random();

		int[] array1 = new int[10];
		int count = 0;

		for (int i = 0; i < array1.length; i++) {
			array1[i] = rd.nextInt(100);
		}
		System.out.print("array�� ��� �ִ� Ȧ���� ");

		for (int i = 0; i < array1.length; i++) {

			if (array1[i] % 2 == 1)	{
				System.out.print(array1[i] + " ");		
				count = count+1;
			} 

		}
		System.out.println("�̸�,");
		System.out.println("�� " + count + "�� �Դϴ�.");

	}

}
