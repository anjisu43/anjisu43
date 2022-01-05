package Bank;

import java.util.Scanner;

public class PiggyBankSimulator {

	public static void main(String[] args) {
		System.out.println("====== 돼지 저금통 시뮬레이터 ======");		
		System.out.println("[1]입금하기  [2]출금하기  [3]잔액확인");
	
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		PiggyBank piggy = new PiggyBank();
		
		if(choice==1) {
			System.out.print("저금할 금액 입력 : ");
			int input_money = sc.nextInt();
			
			int result_money = piggy.deposit(input_money);
			
			System.out.println("현재 누적된 금액 : " + result_money);
		
		}else if(choice==2) {
			System.out.println("출금할 금액 : ");
			int out_money = sc.nextInt();
			boolean isSuccess = piggy.withdraw(out_money);
			if(isSuccess) {
				System.out.println("출금 성공!!");
			}else {
				System.out.println("출금 실패!!");
			}
			
			
		}else if(choice==3) {
			int remain_money = piggy.getMoney();
			System.out.println("현재 남은 금액 : " + remain_money);
			
		}
		
		

	}

}
