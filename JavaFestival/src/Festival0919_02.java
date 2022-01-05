import java.util.Scanner;

public class Festival0919_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 >> ");
		int input = sc.nextInt();
		
		int[] num = new int[10];
		
		int i = 0;
		
		while(input !=1) {
			num[i++] = input%2;
			
			input = input/2;
		}
		num[i] = input;
		for(int j = i; j>=0; --j) {
			System.out.print(num[j] + " ");
		}
		
		

	}

}
