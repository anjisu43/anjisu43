import java.util.Random;

public class ex_03배열실습 {

	public static void main(String[] args) {
		
//		크기가 10인 정수형 배열 생성
//		각각의 자리에 0~19 사이의 랜덤한 값을 집어넣기
//		생성된 배열에 값 출력하기
		
		Random rd = new Random();
		int[] array1 = new int[10];
	
		for(int i = 0; i<array1.length; i++) {
			array1[i]=rd.nextInt(20);
		}
		
		System.out.print("배열의 값 불러오기 : ");
			
			for(int i = 0; i<array1.length; i++) {
					System.out.print(array1[i]+" ");
				}
//		4번째 인덱스에 있는 값과 9번째 인덱스에 있는 값 더해서 결과 출력하기
			
			System.out.println("\n4번째 인덱스 값 :"+array1[4]);	
			System.out.println("9번째 인덱스 값 :"+array1[9]);	
			
			int sum4_9 = array1[4] + array1[9];
			
//			System.out.println("두 값을 더한 결과 :"+(array1[4]+array1[9]));
			System.out.println("두 값을 더한 결과 :"+sum4_9);
			
//			누적 합 구하기
//			누적 합을 계산할 변수 total 만들기
			
			double total = 0;
			
//			반복문을 통해서 배열에 있는 값을 하나씩 불러와서 total에 누적시키기
			
			for(int i = 0; i<array1.length; i++) {
				total += array1[i];
				
			}
			
//			반복문이 종료되는 시점에 total 출력하기
			
			System.out.print("배열에 있는 값 들의 총합 " + total);
			
//			배열에 있는 모든 수의 평균 구하기
			
			double mean = total/array1.length;
			System.out.println("\n배열에 있는 모든 수의 평균 :" + mean);


	}

}
