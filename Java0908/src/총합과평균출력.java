import java.util.Scanner;

public class ���հ������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];
		for(int i = 0; i<num.length; i++) {
			System.out.print((i+1)+"��° �Է� >> ");
			 num[i] = sc.nextInt();						
		}
		System.out.print("�Էµ� ����: ");
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");		
		}
	
		int max = num[0];
		for(int i = 1; i<num.length; i++) {
			if(num[i]>max) {
				max = num[i];
			}
		}
		System.out.println("\n"+"�ְ����� : " + max);
		
		
		int mini = num[0];
		for(int i = 1; i<num.length; i++) {
			if(num[i]<mini) {
				mini = num[i];
			}
		}
		System.out.println("�������� : " + mini);
		
		int sum = 0;		
		for(int i = 0; i<num.length; i++) {
			sum += num[i];
		}
		System.out.println("����: " + sum);
		System.out.print("��� : " + (double)sum/num.length);

	}

}
