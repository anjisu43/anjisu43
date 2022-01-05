import java.util.Scanner;

public class Festival0916_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		int [] num= new int[10];
		int a = 0;
		for(int i = 1; i<=10; i++) {
			System.out.print(i + "번째 정수 입력  >> ");
			num[a] = sc.nextInt();			
			a++;
		}
		System.out.print("3의 배수 : ");
			for(a=0; a<num.length;a++) {
				if(num[a]%3==0) {
					System.out.print(num[a] + " ");
				}else {
					
				}
			}	

	}

}
