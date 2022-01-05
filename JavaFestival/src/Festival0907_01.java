import java.util.Scanner;

public class Festival0907_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 수 입력 : ");
		int dan = sc.nextInt();
		System.out.print("어느 수 까지 출력 : ");
		int soo =  sc.nextInt();
		System.out.println(dan+"단");
		
		for(int i = 1; i<=soo ; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		
		

	}

}
