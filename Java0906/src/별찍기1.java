import java.util.Scanner;

public class �����1 {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�� ���� : ");
		
		int i = sc.nextInt();
		
		for(int num=1;num<=i;num++) {
			for (int a = 0; a < num; a++) {
	
		    	System.out.print("*");
		   }
	    	System.out.println();
	    }
	    	
		
	}

}
