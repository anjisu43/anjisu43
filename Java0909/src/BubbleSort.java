import java.util.Scanner;


public class BubbleSort {

	public static void main(String[] args) {
		// 크기가 5인 정수형 배열 를 만들고
		// 사용자가 입력한 값으로 초기화 시켜주세요!
		
		
		Scanner sc = new Scanner(System.in);
		int[] number = new int [5];
		for(int i = 0; i<number.length;i++) {
			System.out.print((i+1)+"번째 값 >> ");
			number[i] = sc.nextInt();
		}
		//배열 출력
		//치환 -> 변수의 값들을 바꾸기
		
		
		
		for(int i = 0; i <number.length; i++) {
			for(int c =0; c<number.length-(i+1); c++)
				if(number[c]>number[c+1]) {
					int temp = number[c+1];
					number[c+1]= number[c];
					number[c]= temp;									
		}
		}
		for(int i =0; i<number.length;i++) {
			System.out.print(number[i]+ " ");
			}
				

	}

}
