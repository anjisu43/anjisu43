
public class �޼ҵ����2 {

	public static void main(String[] args) {
		// ���� �� ���� �Է��ϸ� 10���ڸ� ���ϴ� �����ϴ� �޼ҵ�
		// 444 -> 400
		// 111 -> 100
		
		//�޼ҵ� ȣ��
		String rs1 = kill10(444);
		String rs2 = kill10(111);
		
		System.out.println("rsl : "+ rs1);
		System.out.println("rs2 : "+ rs2);

	}
	// �޼ҵ� ����
	public static String kill10(int num) {
		String result = (num / 100) + "00";
		
		return result;
	}

}
