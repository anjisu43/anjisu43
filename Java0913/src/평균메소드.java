
public class ��ո޼ҵ� {

	public static void main(String[] args) {
			
		double rs = mean(56,80,63);
		System.out.println(rs);

	}
	// �޼ҵ� ���� : kor, eng, math
	public static double mean(int kor, int eng, int math) {
		
		double result = (kor+eng+math)/3.0;
		
		return result;
		
	}
// �޼ҵ� �ߺ����� : ���� �޼ҵ带 �����ϴ� ��
// �Ű������� ������ Ÿ���̳� ������ �޶�� ����
	
	public static double mean(int kor, int eng, int math,int java) {
		
		double result = (kor+eng+math+java)/4.0;
		
		return result;
		
	}
	//�� ���� ������ �Ǽ��� �Է�
	public static double mean(double kor, double eng, double math , double java) {
		
		double result = (kor+eng+math+java)/4.0;
		
		return result;
		
	}
	
	
	
}
