import java.util.Scanner;

public class ȸ������_�α��� {

	public static void main(String[] args) {
		// 1.ȸ������ 2.�α��� 3.����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====ȸ������ �ý���====");
		String[] id = {"","",""};
		String[] pw = {"","",""};
		int i = 0;
		String input_id; 
		String input_pw;
		
		while(true) {
			
			System.out.println("1.ȸ������ 2.�α��� 3.����");
			
			int choice = sc.nextInt();
			
			if(choice==1) {//ȸ������
				System.out.println("===ȸ������===");
				System.out.print("id �Է� : ");
				id[i] = sc.next();
				System.out.print("pw �Է� : ");
				pw[i] = sc.next();
				i++;
				System.out.println("���Լ���");
				
			}
			else if(choice==2) {//�α���
				System.out.println("===�α���===");
				System.out.print("id �Է� : ");
								
					input_id = sc.next();
				
				System.out.print("pw �Է� : ");	
					
					input_pw = sc.next();
					
					
				//��ǻ�;� �迭�ȿ� ����ڰ� �Է��� input_id �� input_pw �� �ִٸ�
				//�α��� �����̶�� ����ϰ�, �ƴ϶�� �α��� ���з� �������
				//�α��� ���� ���� = count  ������ ����
				int count = 0;
				for(int a=0;a<id.length;a++) {
					if(id[a].equals(input_id)&&pw[a].equals(input_pw)) {
						System.out.println("�α��� ����!");
						count++;
					}
				}
				if(count==0) {
					System.out.println("�α��� ���Ф�");
				}
			}
				 
					
				
			else if(choice==3) {//���α׷� ����
				System.out.println("===���α׷��� �����մϴ�===");	
				break;
			}
			else {
				System.out.println("��ȣ�� �ùٸ��� �Է��ϼ���!!");
			}
	
		
		}
		
		

	}

}
