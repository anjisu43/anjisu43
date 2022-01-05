package 쪽지시험;

import java.util.Scanner;

public class 쪽지시험풀이05 {

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
				System.out.println("다시 확인하세요!");
			}
			else { 
				System.out.println(id+"님 환영합니다.");
				break;
			}
		}
		
	}

}
