import java.util.Scanner;


public class BubbleSort {

	public static void main(String[] args) {
		// ũ�Ⱑ 5�� ������ �迭 �� �����
		// ����ڰ� �Է��� ������ �ʱ�ȭ �����ּ���!
		
		
		Scanner sc = new Scanner(System.in);
		int[] number = new int [5];
		for(int i = 0; i<number.length;i++) {
			System.out.print((i+1)+"��° �� >> ");
			number[i] = sc.nextInt();
		}
		//�迭 ���
		//ġȯ -> ������ ������ �ٲٱ�
		
		
		
		for(int i = 0; i <number.length; i++) {
			for(int c =0; c<number.length-(i+1); c++)
				if(number[c]>number[c+1]) {
					int temp = number[c+1];
					number[c+1]= number[c];
					number[c]= temp;									
		}
		}
		for(int i =0; i<number.length;i++) {
			System.out.print(number[i]+ " ");
			}
				

	}

}
