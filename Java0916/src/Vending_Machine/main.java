package Vending_Machine;

import java.util.Scanner;

public class main {


	public static void main(String[] args) {
		Vending_Machine vm1 = new Vending_Machine();
	
		System.out.println("=======�ݾ��� �����ϼ���=======");
		Scanner sc = new Scanner(System.in);
		int input_money = sc.nextInt();
		int input_coin = vm1.coin(input_money);
		System.out.println(input_coin + "��");
		
		System.out.println("===================���Ḧ �����ϼ���=================");
		System.out.println("[1]�ݶ�  [2]���̴�  [3]����� [4]���ڿ��� [5]�̿����� [6]Ŀ��");
		
		int choice = sc.nextInt();
		
		if(choice==1) { 
			System.out.println("�ݶ�");
			int remain = vm1.a(choice);
			System.out.println("�ܾ� : "+ remain);
			
		}else if(choice==2) {
			System.out.println("���̴�");
			int remain = vm1.b(choice);
			System.out.println("�ܾ� : " + remain);
			
		}else if(choice==3) {
			System.out.println("�����");
		int remain = vm1.c(choice);
		System.out.println("�ܾ� : "+ remain);
			
		}else if(choice==4) {
			System.out.println("���ڿ���");
			int remain = vm1.d(choice);
			System.out.println("�ܾ� : "+ remain);
			
		}else if(choice==5) {
			System.out.println("�̿�����");
			int remain = vm1.e(choice);
			System.out.println("�ܾ� : "+ remain);
			
		}else if(choice==6) { 
			System.out.println("Ŀ��");
			int remain = vm1.f(choice);
			System.out.println("�ܾ� : "+ remain);
			
		}
		

	}

}
