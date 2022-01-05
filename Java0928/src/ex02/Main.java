package ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 도형 넓이 계산 프로그램 
		//1.객체지향을 적용해서 설계
		//2.상속개념을 적용
		//3.다형성을 이용해서 확장이 쉬운 프로그램으로 설계
		
		System.out.println("===도형 넓이 계산기===");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
				System.out.println("[1]삼각형  [2]사각형 [3]종료");
			int choice = sc.nextInt();
			
			
			if(choice ==1) {
				System.out.print(Triangle.getName()+"의 밑변을 입력하세요 >> ");
				double base = sc.nextDouble();
				System.out.print(Triangle.getName()+"의 높이를 입력하세요 >> ");
				double height = sc.nextDouble();
				Triangle T = new Triangle(base, height);				
				System.out.println(Triangle.getName()+"의 넓이는 "+T.calArea()+"입니다.");
				
				
			}else if(choice==2) {
				System.out.print(Renctangle.getName()+"의 너비를 입력하세요 >> ");
				double width = sc.nextDouble();
				System.out.print(Renctangle.getName()+"의 높이를 입력하세요 >> ");
				double height = sc.nextDouble();
				Renctangle R = new Renctangle(width, height);
				System.out.println(Renctangle.getName()+"의 넓이는 " + R.calArea()+"입니다.");
				
			}else if(choice==3) {
				break;
			}
		
		}	
	}

}
