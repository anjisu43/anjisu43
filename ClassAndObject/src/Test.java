import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// ���̿� �̸��� ���ÿ� �����ִ� �޼ҵ带 ����� �ʹٸ�? -> Ŭ������ ������!

		// ������� ���̴� 22���Դϴ�. ������� ���̸� �����Ͻÿ�.
		int daeheeAge = 22;
		Scanner sc = new Scanner(System.in);

		// � �� ���� �ϳ����ٰ� ������ �̸��� 22���̶�� ���̸� �����Ͻÿ�.
		Info member = new Info("������", 22);//<--default ������, VO(value object)
		
		member.setName("����ȸ��ħ");

//		member.setName("������");
		System.out.println(member);
//		member.setAge(22);
//		System.out.println(member.getAge());
//		
		Info member2 = new Info();
		
		System.out.println("ȸ�������� �Է��ϼ���");
		String newName = sc.next();
		int newAge = sc.nextInt();
		
		member2.setName(newName);
		member2.setAge(newAge);
		
		System.out.println(member2.getName()+member2.getAge());
		
	


	}

}
