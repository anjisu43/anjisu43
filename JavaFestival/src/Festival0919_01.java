import java.util.Scanner;

public class Festival0919_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[8];
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		int[] num2 = new int[8];
		
		int sum = 0;		
		
		int j = 10000000;
		for(int i =0; i<num.length;i++) {		
				num2[i] = num1/j;
				if(i==0) {
					num[i] = num1/j;
				}else {
					num[i]=num1/j-(num2[i-1]*10);
				}
							
					j = j/10; 			
					sum +=num[i];
							
		}
		System.out.println("합은 "+sum+"입니다.");
				
		
	}

}
