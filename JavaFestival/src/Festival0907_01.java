import java.util.Scanner;

public class Festival0907_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �� �Է� : ");
		int dan = sc.nextInt();
		System.out.print("��� �� ���� ��� : ");
		int soo =  sc.nextInt();
		System.out.println(dan+"��");
		
		for(int i = 1; i<=soo ; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		
		

	}

}
