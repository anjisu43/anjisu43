package ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ���� ���� ��� ���α׷� 
		//1.��ü������ �����ؼ� ����
		//2.��Ӱ����� ����
		//3.�������� �̿��ؼ� Ȯ���� ���� ���α׷����� ����
		
		System.out.println("===���� ���� ����===");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
				System.out.println("[1]�ﰢ��  [2]�簢�� [3]����");
			int choice = sc.nextInt();
			
			
			if(choice ==1) {
				System.out.print(Triangle.getName()+"�� �غ��� �Է��ϼ��� >> ");
				double base = sc.nextDouble();
				System.out.print(Triangle.getName()+"�� ���̸� �Է��ϼ��� >> ");
				double height = sc.nextDouble();
				Triangle T = new Triangle(base, height);				
				System.out.println(Triangle.getName()+"�� ���̴� "+T.calArea()+"�Դϴ�.");
				
				
			}else if(choice==2) {
				System.out.print(Renctangle.getName()+"�� �ʺ� �Է��ϼ��� >> ");
				double width = sc.nextDouble();
				System.out.print(Renctangle.getName()+"�� ���̸� �Է��ϼ��� >> ");
				double height = sc.nextDouble();
				Renctangle R = new Renctangle(width, height);
				System.out.println(Renctangle.getName()+"�� ���̴� " + R.calArea()+"�Դϴ�.");
				
			}else if(choice==3) {
				break;
			}
		
		}	
	}

}
