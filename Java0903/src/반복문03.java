import java.util.Scanner;

public class �ݺ���03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true)  {
			System.out.print("A �Է� >> ");
			int A = sc.nextInt();
			
			System.out.print("B �Է� >> ");
			int B = sc.nextInt();
			
			System.out.println("��� >>" + (A-B));
			
			if(A == 0 && B==0)  {
				break;
			}
			
		} System.out.println("���α׷� ����..");
		
	
	}

}
