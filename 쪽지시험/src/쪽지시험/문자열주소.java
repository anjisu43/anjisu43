package 쪽지시험;

import java.util.Scanner;

public class 문자열주소 {

	public static void main(String[] args) {
		//리터럴 상수
		int num = 10;
		float f= 3.14f;
		String s = "바나나";
		String s2 = "바나나";
		System.out.println(s==s2);
		Scanner sc = new Scanner(System.in);
		
		String s3 = sc.next();
		
		System.out.println(s.equals(s3));

	}

}
