import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		//10���� �� ��ȭ��ȣ�� �迭����
		Scanner sc = new Scanner(System.in);
		
		Personinfo[] list = new Personinfo[10];
		
		System.out.print("�̸� �Է� >> ");
		String name = sc.next();
		
		System.out.print("��ȣ >> ");
		String number = sc.next();
		
		System.out.print("���� �Է� >> ");
		String birth = sc.next();
		
		Personinfo info = new Personinfo(name, number, birth);
//		info.setName(name);
//		info.setNumber(number);
//		info.setBirth(birth);
		
			
	    System.out.println(info.getName()); //name �� ��������
		System.out.println(info.getNumber()); //number �� ��������
		System.out.println(info.getBirth());// birth �� ��������
		
		list[0] = info;
		
		Personinfo info2 = new Personinfo("���ο�","01096123941", "870520" );
		
		list[1] = info2;
		
		for(int i=0; i<list.length; i++) {
			
			System.out.print("�̸� �Է� >> ");
			String name1 = sc.next();
			
			System.out.print("��ȣ >> ");
			String number1 = sc.next();
			
			System.out.print("���� �Է� >> ");
			String birth1 = sc.next();
			
			Personinfo info3 = new Personinfo(name,number,birth);
			list[i] = info3;
		}
		System.out.print("�̸� ��� >>"+list[1].getName());
		System.out.print("��ȣ ��� >>"+list[1].getNumber());
		System.out.print("���� ��� >>"+list[1].getBirth());
			
			
		
		

	}

}
