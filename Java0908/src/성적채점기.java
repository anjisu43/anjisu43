import java.util.Scanner;

public class 성적채점기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] input = new int[5];
		int[] answer = {3,5,1,1,1};
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		
		for(int i = 0; i<input.length; i++) {
			System.out.print((i+1)+"번답 >> ");
			 input[i] = sc.nextInt();						
		}					
		System.out.println("정답확인");
		
		int sum =0;
		
		for(int i = 0; i < answer.length; i++) {
			
									
			if(input[i]==answer[i]) {
				System.out.print("o ");
				sum+=20;
			}
			else{
				System.out.print("x ");
			}
		}
		
		System.out.println("총점 : " + sum);

	}
}
