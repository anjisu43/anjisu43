package ��������;

import java.util.Scanner;

public class ��������Ǯ��05 {

	public static void main(String[] args) {
		String id = "dldmsql";
		String pw = "1214";
		
		String input_id = "";
		String input_pw = "";
				
		Scanner sc = new Scanner(System.in);
		
		while(!id.equals(input_id) || ! pw.equals (input_pw)) {
			System.out.print("id : ");
			input_id = sc.next();
			System.out.print("pw : ");
			input_pw = sc.next();
			if(!id.equals(input_id) || ! pw.equals (input_pw)) {
				System.out.println("�ٽ� Ȯ���ϼ���!");
			}
			else { 
				System.out.println(id+"�� ȯ���մϴ�.");
				break;
			}
		}
		
	}

}
