import java.util.Scanner;

public class JavaFestival_�˰���_����02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �ݾ� �Է� : ");
		int money = sc.nextInt();
		
		System.out.println("�ܵ� : " + money + "��");
		
		int man = money/10000;
		int ohcheon = money%10000/5000;
		int cheon = money&10000%5000/1000;
		int ohbeak = money%1000/500;
		int beak = money%1000%500/100;
		
		System.out.println("10000�� : "+ man + "��");
		System.out.println("5000�� : "+ ohcheon + "��");
		System.out.println("1000�� : "+ cheon + "��");
		System.out.println("500�� : "+ ohbeak + "��");
		System.out.println("100�� : "+ beak + "��");
		
				

	}

}
