
public class �޼ҵ���� {

	public static void main(String[] args) {
		// �޼ҵ� ȣ��(����)
		addNumber(100,900);
		subThreeNumber(3.5f,1.2f,0.4f);
		
		System.out.println("Main ��");
	}
	
	//addNumber �޼ҵ�
	//�޼ҵ� ����
	public static void addNumber(int num1, int num2) {
		
		int result = num1 + num2;
		
		System.out.println(result);
		
	}
	
	//subNumber �޼ҵ�: 3���� �Ǽ��� �Է¹޾Ƽ� ����
	 public static void subThreeNumber(float n1, float n2, float n3) {
		 float result = n1 - n2 - n3;
		 System.out.println(result);
	 }

}
