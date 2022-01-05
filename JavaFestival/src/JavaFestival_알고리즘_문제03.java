import java.util.Scanner;

public class JavaFestival_알고리즘_문제03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("일한 시간을 입력하세요 : ");
		int workhour = sc.nextInt();
		
		int pay = 0;
		
		
		if(workhour<9) {
			pay = workhour*5000;
		}
		else {
			pay = (int) (40000 + (workhour-8)*5000*1.5);
		}
		System.out.println("총 임금은 " + pay + "원 입니다.");

	}

}
