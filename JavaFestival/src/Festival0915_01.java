import java.util.Random;
import java.util.Scanner;

public class Festival0915_01 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(count<5){
			
		for(int i = 1; i<=100; i++) {
			int num1 = rd.nextInt(10)+1;
			int num2 = rd.nextInt(10)+1;
			System.out.print(num1 +"+"+ num2 +"=");
			int sum = sc.nextInt();	
				if(num1+num2==sum) {
					System.out.println("SUCCESS!!");
				
				}
				else if(num1+num2!=sum){
				System.out.println("FAIL...");
					count++;
					
					if(count==5) {
						System.out.println("GAME OVER!");
						break;
					}
					
				}
				
			
				
		}
		}
		

	}

}
