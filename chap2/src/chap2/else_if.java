package chap2;

import java.util.Scanner;

public class else_if {

	public static void main(String[] args) {
		System.out.println("�ݾ����Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		System.out.println("1.�ݶ�800�� 2.����500�� 3.��Ÿ����1500��");
		int menu = sc.nextInt();// ���⼭ menu ��� ������ �ȸ���� �༭ ���� �������!~! --> �׷� �ؿ���

		if (menu == 1) { // menu��� ����ϸ� �ν��� �ȵǿ��
			if (money < 800) {
				System.out.println("�ݾ��� �����մϴ�");
			} else {
				money = money - 800;
			}
		} else if (menu == 2) {
			if (money < 500) {
				System.out.println("�ݾ��� �����մϴ�");
			} else {
				money = money - 500;
			}
		} else if (menu == 3) {
			if (money < 1500) {
				System.out.println("�ݾ��� �����մϴ�");
			} else {
				money = money - 1500;
			}
		}
		System.out.println("�ܵ� : " + money + "��");
		// õ��¥�� �ܵ� ���� ���ϱ�, if������ �Ƚᵵ ������1
		
		//	System.out.println("õ�� : " + money / 1000 + "��");
			
			int õ�� = money/1000;
		
			int ����� = money%1000/500;
			int ��� = money%1000%500/100;
					
				System.out.println("1000��: "+ õ�� + "��, "+ " 500�� : "+ ����� +"��, "+ "100�� : " + ��� + "��");
			}
		
	}


