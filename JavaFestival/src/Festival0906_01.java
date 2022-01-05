import java.util.Scanner;

public class Festival0906_01 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Çà °³¼ö : ");
		
		int i = sc.nextInt();
		
		for(int num=i;num>=1;num--) {
			for (int a = 0; a < num; a++) {
	
		    	System.out.print("*");
		   }
	    	System.out.println();
	    }
	}

}
