import java.util.Scanner;

public class Festival0920_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N �Է� >> ");
		int N1 = sc.nextInt();
		int[] N = new int[N1];
		System.out.print("X �Է� >> ");
		int X = sc.nextInt();
		
		int num;
		
		for(int i = 0; i<N.length; i++) {
			System.out.print(i+1+"��° ���� �Է� >> ");
			 N[i] = sc.nextInt();
		}
		System.out.print("��� >> ");
		
		for(int i = 0; i<N.length; i++) {
			
			if(N[i] <X) {
				System.out.print(N[i] + " ");
		}
		}

	}

}
