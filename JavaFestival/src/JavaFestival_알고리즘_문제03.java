import java.util.Scanner;

public class JavaFestival_�˰���_����03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("���� �ð��� �Է��ϼ��� : ");
		int workhour = sc.nextInt();
		
		int pay = 0;
		
		
		if(workhour<9) {
			pay = workhour*5000;
		}
		else {
			pay = (int) (40000 + (workhour-8)*5000*1.5);
		}
		System.out.println("�� �ӱ��� " + pay + "�� �Դϴ�.");

	}

}
