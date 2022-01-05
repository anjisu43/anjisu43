import java.util.Scanner;

public class Festival0914_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number[] = {0,0,0,0,0};
		int a = 0;
		
		for(int i = 0; i<number.length; i++ ) {
			System.out.print(i+1 + "번째 수 입력 : " );
			number[i] = sc.nextInt();		
		}
		System.out.println("정렬 후");
		
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
