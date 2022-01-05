import java.util.Scanner;

public class 총합과평균출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];
		for(int i = 0; i<num.length; i++) {
			System.out.print((i+1)+"번째 입력 >> ");
			 num[i] = sc.nextInt();						
		}
		System.out.print("입력된 점수: ");
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");		
		}
	
		int max = num[0];
		for(int i = 1; i<num.length; i++) {
			if(num[i]>max) {
				max = num[i];
			}
		}
		System.out.println("\n"+"최고점수 : " + max);
		
		
		int mini = num[0];
		for(int i = 1; i<num.length; i++) {
			if(num[i]<mini) {
				mini = num[i];
			}
		}
		System.out.println("최저점수 : " + mini);
		
		int sum = 0;		
		for(int i = 0; i<num.length; i++) {
			sum += num[i];
		}
		System.out.println("총합: " + sum);
		System.out.print("평균 : " + (double)sum/num.length);

	}

}
