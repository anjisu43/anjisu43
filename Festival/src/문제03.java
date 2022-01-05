
public class 문제03 {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			if(i%2==0) {
				System.out.print(-i+" ");
				sum += i*-1;
			}
			else {
				System.out.print(i+ " ");
				sum += i;
			}
			
		}
		
		System.out.println("\n"+"결과 : "+sum);

	}

}
