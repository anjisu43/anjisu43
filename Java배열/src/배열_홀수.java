import java.util.Random;

public class 배열_홀수 {

	public static void main(String[] args) {
		Random rd = new Random();

		int[] array1 = new int[10];
		int count = 0;

		for (int i = 0; i < array1.length; i++) {
			array1[i] = rd.nextInt(100);
		}
		System.out.print("array에 들어 있는 홀수는 ");

		for (int i = 0; i < array1.length; i++) {

			if (array1[i] % 2 == 1)	{
				System.out.print(array1[i] + " ");		
				count = count+1;
			} 

		}
		System.out.println("이며,");
		System.out.println("총 " + count + "개 입니다.");

	}

}
