
public class ex_01�迭���� {

	public static void main(String[] args) {

//		int    []   numbers = new        int    [4];
//	   �迭Ÿ��   �迭����      ����         �迭����         ������    �迭ũ��
//		                                                         �迭 Ÿ�԰� ����
//	int Ÿ���� �迭�� ����
//	�迭�� �̸��� array1
//	�迭�� ũ��� 4

		int[] array1 = new int[4];

//		 �迭�� �� ����ֱ�

		array1[0] = 10;

//		������ �������� �� ����ֱ�

		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;

//		�迭�� ���� ����ϱ�
//		������ �迭�� ũ�� ���� ���
		System.out.println("�迭�� ���� : "+array1.length);
	
//		�迭�� �� ����ϱ�
//		�ݺ���
		System.out.print("�迭 �� �ҷ����� : ");
		for(int i = 0; i < array1.length; i++) {
//			i�� 0~3���� ������
//			i = 0>10
//		    i = 1>20
//		    i = 2>30
//		    i = 3>40
		    		
			System.out.print(array1[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
