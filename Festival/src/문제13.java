import java.util.Random;
import java.util.Scanner;

public class ����13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[8];
		Random rd = new Random();
		System.out.print("�迭�� �ִ� ��� �� : ");
		for(int i = 0; i<num.length; i++) {
			num[i] = rd.nextInt(100);
			System.out.print(num[i] + " ");
		}
		
		int max = num[0];
		
		for(int i = 1; i<num.length; i++) {
			if(num[i]>max) {
				max = num[i];
			}
		}
		
		System.out.print("\n"+"���� ū �� : "+max);
		
		int mini = num[0];
		for(int i = 1; i<num.length; i++) {
			if(num[i]<mini) {
				mini = num[i];
			}
		}
		System.out.println("\n"+"���� ���� �� : " + mini);
	
	

	}

}
