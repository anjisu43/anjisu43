package chap2;

import java.util.Scanner;

public class else_if {

	public static void main(String[] args) {
		System.out.println("금액을입력하세요");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		System.out.println("1.콜라800원 2.생수500원 3.비타워터1500원");
		int menu = sc.nextInt();// 여기서 menu 라는 변수를 안만들어 줘서 오류 났었어요!~! --> 그럼 밑에서

		if (menu == 1) { // menu라고 사용하면 인식이 안되요옹
			if (money < 800) {
				System.out.println("금액이 부족합니다");
			} else {
				money = money - 800;
			}
		} else if (menu == 2) {
			if (money < 500) {
				System.out.println("금액이 부족합니다");
			} else {
				money = money - 500;
			}
		} else if (menu == 3) {
			if (money < 1500) {
				System.out.println("금액이 부족합니다");
			} else {
				money = money - 1500;
			}
		}
		System.out.println("잔돈 : " + money + "원");
		// 천원짜리 잔돈 갯수 구하기, if구절은 안써도 무방함1
		
		//	System.out.println("천원 : " + money / 1000 + "개");
			
			int 천원 = money/1000;
		
			int 오백원 = money%1000/500;
			int 백원 = money%1000%500/100;
					
				System.out.println("1000원: "+ 천원 + "개, "+ " 500원 : "+ 오백원 +"개, "+ "100원 : " + 백원 + "개");
			}
		
	}


