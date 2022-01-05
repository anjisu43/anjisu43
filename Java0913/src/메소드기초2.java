
public class 메소드기초2 {

	public static void main(String[] args) {
		// 정수 한 개를 입력하면 10의자리 이하는 제거하는 메소드
		// 444 -> 400
		// 111 -> 100
		
		//메소드 호출
		String rs1 = kill10(444);
		String rs2 = kill10(111);
		
		System.out.println("rsl : "+ rs1);
		System.out.println("rs2 : "+ rs2);

	}
	// 메소드 정의
	public static String kill10(int num) {
		String result = (num / 100) + "00";
		
		return result;
	}

}
