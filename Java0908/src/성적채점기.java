import java.util.Scanner;

public class ����ä���� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] input = new int[5];
		int[] answer = {3,5,1,1,1};
		
		System.out.println("==ä���ϱ�==");
		System.out.println("���� �Է��ϼ���");
		
		for(int i = 0; i<input.length; i++) {
			System.out.print((i+1)+"���� >> ");
			 input[i] = sc.nextInt();						
		}					
		System.out.println("����Ȯ��");
		
		int sum =0;
		
		for(int i = 0; i < answer.length; i++) {
			
									
			if(input[i]==answer[i]) {
				System.out.print("o ");
				sum+=20;
			}
			else{
				System.out.print("x ");
			}
		}
		
		System.out.println("���� : " + sum);

	}
}
