import java.util.Scanner;

public class JavaFestival_�˰���_���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num1 = sc.nextInt();
		int oneJali = num1%10;
		
		if(oneJali>=5)  { 
			num1 = (num1-oneJali)+10;
		}
		else  {
			num1 = num1-oneJali;
		}
		System.out.println("�ݿø��� : "+ num1);
		

	}

}
