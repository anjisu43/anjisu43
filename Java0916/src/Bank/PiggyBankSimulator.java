package Bank;

import java.util.Scanner;

public class PiggyBankSimulator {

	public static void main(String[] args) {
		System.out.println("====== ���� ������ �ùķ����� ======");		
		System.out.println("[1]�Ա��ϱ�  [2]����ϱ�  [3]�ܾ�Ȯ��");
	
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		PiggyBank piggy = new PiggyBank();
		
		if(choice==1) {
			System.out.print("������ �ݾ� �Է� : ");
			int input_money = sc.nextInt();
			
			int result_money = piggy.deposit(input_money);
			
			System.out.println("���� ������ �ݾ� : " + result_money);
		
		}else if(choice==2) {
			System.out.println("����� �ݾ� : ");
			int out_money = sc.nextInt();
			boolean isSuccess = piggy.withdraw(out_money);
			if(isSuccess) {
				System.out.println("��� ����!!");
			}else {
				System.out.println("��� ����!!");
			}
			
			
		}else if(choice==3) {
			int remain_money = piggy.getMoney();
			System.out.println("���� ���� �ݾ� : " + remain_money);
			
		}
		
		

	}

}
