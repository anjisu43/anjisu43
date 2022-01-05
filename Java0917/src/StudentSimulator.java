import java.util.Scanner;

public class StudentSimulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student [] stuList = new Student[10]; //��ϵ� �л����� ����
		int index = 0; // ����� �л��� ��ġ
		System.out.println("======= SMHRD �������� �ý��� =======");
		                       
			
		while(true) {
				System.out.println("[1] �л���� [2] ��������  [3]����");
				int choice = sc.nextInt();
				
				if(choice == 1&&index<stuList.length) {
					
					System.out.print("����� �л� �̸� >> ");
					String name = sc.next();
					System.out.print("����� �л� �й� >> ");
					String stuNumber = sc.next();
					
					Student st = new Student(name, stuNumber);
					
					if(index<stuList.length) {
					stuList[index++] = st;
					}
					else {
						System.out.println("�� �̻� �л��� ����� �� �����ϴ�.");
					} 
					
				}else if (choice == 2) {
					System.out.print("������ �л� �̸� >> ");
					String name = sc.next();
					// �ش� �л��� �˻�(������ ��ġ : �迭�� 0������ ���������� ��)
					int stuIndex = -1; //ã�� �л��� ��ġ
					for(int i = 0; i<index; i++) {
						if(name.equals(stuList[i].getName())) {
							stuIndex = i;
						}
					}
					if(stuIndex==-1) {
						System.out.println("��ϵ� �л��� �����ϴ�.");
					}else  {
						// 1. �ѹ��� �Ѱ��� ����
						// 2. �ѹ��� 3���� ��� ����
						System.out.println("������ ������ �����ϼ���.");
						System.out.println("[1]Java [2]Web [3]Iot [4]��");
						int choiceSub = sc.nextInt();
						if(choiceSub==4) {
							
							System.out.println("���� ������ ��Ĩ�ϴ�.");}
					  
						while(true) {
							if(choiceSub==1) {
								  System.out.print("�� ������ �����Ͻðڽ��ϱ�? >>");
									int score = sc.nextInt();
								stuList[stuIndex].changeJava(score);
								
							}else if(choiceSub==2) {
								  System.out.print("�� ������ �����Ͻðڽ��ϱ�? >>");
									int score = sc.nextInt();
								stuList[stuIndex].changeWeb(score);
													
							}else if(choiceSub==3) { 
								  System.out.print("�� ������ �����Ͻðڽ��ϱ�? >>");
									int score = sc.nextInt();
								stuList[stuIndex].changeIot(score);							
							}	
							System.out.println("������ �Ϸ�Ǿ����ϴ�.");
							break;
						
					
					}
				}	
				}else if (choice == 3) { 
					break;
				}
		}

	}

}

