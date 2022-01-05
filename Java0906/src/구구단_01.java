
public class 구구단_01 {

	public static void main(String[] args) {
		
		for (int a=2; a<=9; a++) {
			System.out.print(a+"단 : ");
			for (int i=1; i<=9; i++) {
				System.out.print(a+"*"+i+"="+(a*i)+" ");
			}
			System.out.println(" ");
		}
	}

}
