
public class 메소드기초 {

	public static void main(String[] args) {
		// 메소드 호출(실행)
		addNumber(100,900);
		subThreeNumber(3.5f,1.2f,0.4f);
		
		System.out.println("Main 끝");
	}
	
	//addNumber 메소드
	//메소드 정의
	public static void addNumber(int num1, int num2) {
		
		int result = num1 + num2;
		
		System.out.println(result);
		
	}
	
	//subNumber 메소드: 3개의 실수를 입력받아서 뺄셈
	 public static void subThreeNumber(float n1, float n2, float n3) {
		 float result = n1 - n2 - n3;
		 System.out.println(result);
	 }

}
