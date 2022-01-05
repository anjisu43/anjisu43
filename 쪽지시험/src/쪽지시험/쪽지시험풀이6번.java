package 쪽지시험;

import java.util.Scanner;

public class 쪽지시험풀이6번 {

	public static void main(String[] args) {
		String[] fruits = {"사과", "키위", "레몬", "자몽", "깔라만시", "복숭아"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾고 싶은 과일 : ");
		String input = sc.next();
		
		int findIndex = -1;
		
		for(int i = 0; i<fruits.length ; i++) {
			if(input.equals(fruits[i])) {
				findIndex = i;
				break;
			}
			
		}
		
		if(findIndex == -1) {
			System.out.println("찾는 과일이 없습니다.");
		}
		else {
			System.out.println(input + "의 위치는 " + findIndex + "번째 입니다.");
		}

	}

}
