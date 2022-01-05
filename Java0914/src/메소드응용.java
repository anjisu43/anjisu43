import java.util.Arrays;

public class 메소드응용 {

	public static void main(String[] args) {
//		1. 약수인지 아닌지를 알려주는 메소드
//		메소드 이름
//		입력인자(매게변수) : 정수2개 (나눔을 당하는수, 약수인지 알아보는 수)
		//반환타입(리턴타입) : 논리(boolean)
		// 메소드 호출
		int base  = 10, divisor = 2;
//		boolean result = isDivisir(base, divisor);
//		System.out.println(result);
		
		// 2. 입력된 수자의 약수들을 알려주는 메소드
		// 메소드 이름 : getDivisors
		// 입력인자 : 정수 1개
		// 반환타입(리턴타입) : 정수형배열 
		
		// 메소드 호출
		base = 20;
		int[] result_array= getDivisors(base);
		
		System.out.println(Arrays.toString(result_array));
		// 3. 입력된 숫자가 소수인지 알려주는 메소드
		// 메소드 이름 : isPrime
		// 입력인자 : 1보다 큰 정수 1개
		// 반환타입 : boolean
		
		// 메소드 호출
		
		base = 11;
		boolean result_prime = isPrime(base);
		System.out.println(result_prime);
		

	}

	private static boolean isPrime(int base) {
		// 기존에 작성한 메소드를 활용
		
		
		return getDivisors(base).length == 2;
	}

	private static int[] getDivisors(int base) {
		
		int[] array = new int[base];
		
		int index = 0;
		for(int i = 1; i<=base; i++) {
			if(base%i==0) {  // 약수 성립
			
				array[index++] = i;
				
		}
	}//	Arrays.copyOf() : 배열을 원하는 길이까지 복제
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
