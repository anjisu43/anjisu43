import java.util.ArrayList;

public class PoketmonMain {

	public static void main(String[] args) {
		
		// ���ϸ� ���� ��Ȯ�� �� �� ����.
		// ���ϸ� ������ ����� �����ϴ��� �� �� ����.
		
		ArrayList<Poketmon> poktList = new ArrayList<Poketmon>();
		Poketmon pika = new Poketmon("��ī��", "����", 80, 60, 70);
		Poketmon piri = new Poketmon("���̸�", "��", 90, 40, 50);
		Poketmon ggobuk = new Poketmon("������", "��", 60, 70, 65);
		Poketmon purin = new Poketmon("Ǫ��", "�뷡", 80, 30, 40);
		Poketmon ddogas = new Poketmon("�ǰ���", "����", 90, 40, 20);
		
		//���ϸ󵵰� �߰�
		poktList.add(pika);
		poktList.add(piri);
		poktList.add(ggobuk);
		poktList.add(purin);
		poktList.add(ddogas);
		
		System.out.println("��ī�� ���ݷ� : " + poktList.get(0).getAttack());
		System.out.println("�ǰ��� ü�� : " + poktList.get(0).getHp());
		

	}

}
