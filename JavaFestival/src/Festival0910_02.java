import java.util.Scanner;

public class Festival0910_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		int num = sc.nextInt();
		int pack = 1;
			
		for(int i = num; i>0; i--) {
			
			pack = pack*i;
			
			
		}
		System.out.print("��� : "+pack);

	}

}
