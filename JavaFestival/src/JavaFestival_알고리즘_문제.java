import java.util.Scanner;

public class JavaFestival_알고리즘_문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num1 = sc.nextInt();
		int oneJali = num1%10;
		
		if(oneJali>=5)  { 
			num1 = (num1-oneJali)+10;
		}
		else  {
			num1 = num1-oneJali;
		}
		System.out.println("반올림수 : "+ num1);
		

	}

}
