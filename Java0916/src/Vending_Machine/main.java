package Vending_Machine;

import java.util.Scanner;

public class main {


	public static void main(String[] args) {
		Vending_Machine vm1 = new Vending_Machine();
	
		System.out.println("=======금액을 투입하세요=======");
		Scanner sc = new Scanner(System.in);
		int input_money = sc.nextInt();
		int input_coin = vm1.coin(input_money);
		System.out.println(input_coin + "원");
		
		System.out.println("===================음료를 선택하세요=================");
		System.out.println("[1]콜라  [2]사이다  [3]흰우유 [4]초코우유 [5]이온음료 [6]커피");
		
		int choice = sc.nextInt();
		
		if(choice==1) { 
			System.out.println("콜라");
			int remain = vm1.a(choice);
			System.out.println("잔액 : "+ remain);
			
		}else if(choice==2) {
			System.out.println("사이다");
			int remain = vm1.b(choice);
			System.out.println("잔액 : " + remain);
			
		}else if(choice==3) {
			System.out.println("흰우유");
		int remain = vm1.c(choice);
		System.out.println("잔액 : "+ remain);
			
		}else if(choice==4) {
			System.out.println("초코우유");
			int remain = vm1.d(choice);
			System.out.println("잔액 : "+ remain);
			
		}else if(choice==5) {
			System.out.println("이온음료");
			int remain = vm1.e(choice);
			System.out.println("잔액 : "+ remain);
			
		}else if(choice==6) { 
			System.out.println("커피");
			int remain = vm1.f(choice);
			System.out.println("잔액 : "+ remain);
			
		}
		

	}

}
