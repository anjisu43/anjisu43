import java.util.Scanner;

public class JavaFestival_알고리즘_문제02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 금액 입력 : ");
		int money = sc.nextInt();
		
		System.out.println("잔돈 : " + money + "원");
		
		int man = money/10000;
		int ohcheon = money%10000/5000;
		int cheon = money&10000%5000/1000;
		int ohbeak = money%1000/500;
		int beak = money%1000%500/100;
		
		System.out.println("10000원 : "+ man + "개");
		System.out.println("5000원 : "+ ohcheon + "개");
		System.out.println("1000원 : "+ cheon + "개");
		System.out.println("500원 : "+ ohbeak + "개");
		System.out.println("100원 : "+ beak + "개");
		
				

	}

}
