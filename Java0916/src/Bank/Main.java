package Bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ���� ������ ����(Object)
		// Ŭ������ ������ = new Ŭ������();
		PiggyBank p1 = new PiggyBank();
		
		PiggyBank p2 = new PiggyBank();
		
		int result_p1 = p1.deposit(5000);
		System.out.print("p1 ���� ������ �ݾ� : " + result_p1);
		
		result_p1 = p1.deposit(1000);
	
		System.out.print("\n"+"p1 ���� ������ �ݾ� : " + result_p1);
		
		int result_p2 = p2.deposit(9000);
		
		System.out.println("\n"+"p2 ���� ������ �ݾ� : " + result_p2);
		
		boolean isSuccess = p2.withdraw(3000);
		if(isSuccess) {
			System.out.println("��� ����!!");
		}else {
			System.out.println("��� ����!!");
		}
		
		int remain_p2 = p2.getMoney();
		
		System.out.println("p1�� ���� �ݾ� : " + remain_p2);
	
		//Ŭ������ �ʵ带 ���� ���� �Ϲ�������  private�� �ٿ���
		//�����͸� ��ȣ����!!, ���� �޼ҵ�� ������ �� �� �ְ��ؾ� ��Ʈ���� ����������!
		//p1.money = -10000


	}

}
