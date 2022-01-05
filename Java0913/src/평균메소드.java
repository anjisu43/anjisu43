
public class 평균메소드 {

	public static void main(String[] args) {
			
		double rs = mean(56,80,63);
		System.out.println(rs);

	}
	// 메소드 정의 : kor, eng, math
	public static double mean(int kor, int eng, int math) {
		
		double result = (kor+eng+math)/3.0;
		
		return result;
		
	}
// 메소드 중복정의 : 같은 메소드를 지정하는 것
// 매개변수의 데이터 타입이나 갯수가 달라야 성립
	
	public static double mean(int kor, int eng, int math,int java) {
		
		double result = (kor+eng+math+java)/4.0;
		
		return result;
		
	}
	//각 과목 점수를 실수로 입력
	public static double mean(double kor, double eng, double math , double java) {
		
		double result = (kor+eng+math+java)/4.0;
		
		return result;
		
	}
	
	
	
}
