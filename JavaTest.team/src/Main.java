import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		

		StoreController st = new StoreController();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("[1]���������� [2]�̿�Ǻ��� [3]�󼼺��� [4]�������� [5]���� >> ");
			int num = sc.nextInt();
			if (num==1) {
				System.out.println("====����������====");
				st.getRestaurent();
			}else if (num==2) {
				System.out.println("====�̿�Ǻ���====");
				st.getSalon();
			}else if (num==3) {
				System.out.println("====������====");
				System.out.print("���Ը� �Է� : ");
				String n = sc.next();
				st.point(n);
			}else if (num==4) {
				st.totalPoint();
			}else if (num==5) {
				System.out.println("����");
				break;
			}else {
				System.out.println("��Ȯ�� ���ڸ� �Է��� �ּ���.");
			}
		}

	}

}
