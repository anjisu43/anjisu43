
public class �ú��ʺ�ȯ�޼ҵ� {

	public static void main(String[] args) {
//		�޼ҵ� �̸�: secondToHMS
//		�Է� : ����Ÿ�� => �� ����
//		��ȯ : ���ڿ�Ÿ�� => 0�� 0�� 0��
//		test case : 60 => 0�� 1�� 0��
//		          : 185 => 0�� 3�� 5��
//		          : 3600 => 1�� 0�� 0��	
		String tm = secondToHMS(3850);
		System.out.println(tm);
		
		

	}
	public static String secondToHMS(int time) {
		
		String result = "";
		int H = time/3600;
		int M = time%3600/60;
		int S = time%60;
		result += H + "��" + M +"��" + S + "��";
				return result;
	}

}
