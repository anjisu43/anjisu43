
public class Festival0907_03 {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <=100 ; ++i) {	

			if (i % 2 == 0) {
				System.out.print(-i + " ");
				sum += i*-1;
			} else {
				System.out.print(i + " ");
				sum +=i;
			}
			
		}System.out.println("\n"+"°á°ú : "+sum);

	}

}
