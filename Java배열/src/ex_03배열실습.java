import java.util.Random;

public class ex_03�迭�ǽ� {

	public static void main(String[] args) {
		
//		ũ�Ⱑ 10�� ������ �迭 ����
//		������ �ڸ��� 0~19 ������ ������ ���� ����ֱ�
//		������ �迭�� �� ����ϱ�
		
		Random rd = new Random();
		int[] array1 = new int[10];
	
		for(int i = 0; i<array1.length; i++) {
			array1[i]=rd.nextInt(20);
		}
		
		System.out.print("�迭�� �� �ҷ����� : ");
			
			for(int i = 0; i<array1.length; i++) {
					System.out.print(array1[i]+" ");
				}
//		4��° �ε����� �ִ� ���� 9��° �ε����� �ִ� �� ���ؼ� ��� ����ϱ�
			
			System.out.println("\n4��° �ε��� �� :"+array1[4]);	
			System.out.println("9��° �ε��� �� :"+array1[9]);	
			
			int sum4_9 = array1[4] + array1[9];
			
//			System.out.println("�� ���� ���� ��� :"+(array1[4]+array1[9]));
			System.out.println("�� ���� ���� ��� :"+sum4_9);
			
//			���� �� ���ϱ�
//			���� ���� ����� ���� total �����
			
			double total = 0;
			
//			�ݺ����� ���ؼ� �迭�� �ִ� ���� �ϳ��� �ҷ��ͼ� total�� ������Ű��
			
			for(int i = 0; i<array1.length; i++) {
				total += array1[i];
				
			}
			
//			�ݺ����� ����Ǵ� ������ total ����ϱ�
			
			System.out.print("�迭�� �ִ� �� ���� ���� " + total);
			
//			�迭�� �ִ� ��� ���� ��� ���ϱ�
			
			double mean = total/array1.length;
			System.out.println("\n�迭�� �ִ� ��� ���� ��� :" + mean);


	}

}
