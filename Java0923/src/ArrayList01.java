import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList01 {

	public static void main(String[] args) {
		
		String[] name = new String[3];
		ArrayList<String> nameArray = new ArrayList<String>();
		
		// �� �ʱ�ȭ
		// �迭 ù��°�� �� �ʱ�ȭ
		name[0] = "��ȯ";
		
		//arrayList �� �߰�
		nameArray.add("��ȯ");
		nameArray.add("����");
		
		//�� ��������
		System.out.println(name[0]);
		System.out.println(nameArray.get(0));
		System.out.println(nameArray.get(1));
		
		//�� ����
		nameArray.add(1, "����");
		System.out.println(nameArray.get(1));
		System.out.println(nameArray.get(2));
		
		nameArray.add(2, "�ص�");
		System.out.println(nameArray.get(2));
		
		System.out.println("������ ũ�� : " + name.length);
		
		System.out.println("��̸���Ʈũ�� : " + nameArray.size());
		
		//����
		//name[0] = ""; //�Ϲ� �迭 -> ������� ������ ����, ���� �ϰ� �ʹٸ� ������ �ʱ�ȭ�� ����! -> ���̰� ������ �־� 
		nameArray.remove(1);
		System.out.println(name);
		System.out.println(Arrays.toString(name));
		System.out.println(nameArray);
		//ArrayListSMS toString�� �⺻������ �����ϰ� �ִ�
	}

}
