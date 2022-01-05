
public class 시분초변환메소드 {

	public static void main(String[] args) {
//		메소드 이름: secondToHMS
//		입력 : 정수타입 => 초 단위
//		반환 : 문자열타입 => 0시 0분 0초
//		test case : 60 => 0시 1분 0초
//		          : 185 => 0시 3분 5초
//		          : 3600 => 1시 0분 0초	
		String tm = secondToHMS(3850);
		System.out.println(tm);
		
		

	}
	public static String secondToHMS(int time) {
		
		String result = "";
		int H = time/3600;
		int M = time%3600/60;
		int S = time%60;
		result += H + "시" + M +"분" + S + "초";
				return result;
	}

}
