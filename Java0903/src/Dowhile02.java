import java.util.Scanner;

public class Dowhile02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int nowKg = sc.nextInt();

		System.out.print("목표몸무게 : ");
		int wantKg = sc.nextInt();

		int week = 1;
		do {
			System.out.print(week++ + "주차 감량 몸무게 : ");
			int lossKg = sc.nextInt();
			nowKg = nowKg - lossKg;

		} while (nowKg >= wantKg);
		System.out.println(nowKg + "달성!! 축하합니다!");

	}
}
