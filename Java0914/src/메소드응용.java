import java.util.Arrays;

public class �޼ҵ����� {

	public static void main(String[] args) {
//		1. ������� �ƴ����� �˷��ִ� �޼ҵ�
//		�޼ҵ� �̸�
//		�Է�����(�ŰԺ���) : ����2�� (������ ���ϴ¼�, ������� �˾ƺ��� ��)
		//��ȯŸ��(����Ÿ��) : ��(boolean)
		// �޼ҵ� ȣ��
		int base  = 10, divisor = 2;
//		boolean result = isDivisir(base, divisor);
//		System.out.println(result);
		
		// 2. �Էµ� ������ ������� �˷��ִ� �޼ҵ�
		// �޼ҵ� �̸� : getDivisors
		// �Է����� : ���� 1��
		// ��ȯŸ��(����Ÿ��) : �������迭 
		
		// �޼ҵ� ȣ��
		base = 20;
		int[] result_array= getDivisors(base);
		
		System.out.println(Arrays.toString(result_array));
		// 3. �Էµ� ���ڰ� �Ҽ����� �˷��ִ� �޼ҵ�
		// �޼ҵ� �̸� : isPrime
		// �Է����� : 1���� ū ���� 1��
		// ��ȯŸ�� : boolean
		
		// �޼ҵ� ȣ��
		
		base = 11;
		boolean result_prime = isPrime(base);
		System.out.println(result_prime);
		

	}

	private static boolean isPrime(int base) {
		// ������ �ۼ��� �޼ҵ带 Ȱ��
		
		
		return getDivisors(base).length == 2;
	}

	private static int[] getDivisors(int base) {
		
		int[] array = new int[base];
		
		int index = 0;
		for(int i = 1; i<=base; i++) {
			if(base%i==0) {  // ��� ����
			
				array[index++] = i;
				
		}
	}//	Arrays.copyOf() : �迭�� ���ϴ� ���̱��� ����
		return Arrays.copyOf(array, index);
		
		
	}	
	
	
		 private static boolean isDivisir(int base, int divisor) {  
			 	if(base%divisor==0) { 
				 return true; 
				 }  
			 	else {
					 return false; 
					 } 
	
			
		
		
		
		
		
	}

	
	
	
	
	
	
}
