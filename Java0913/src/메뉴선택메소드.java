import java.util.Random;

public class 메뉴선택메소드 {

	public static void main(String[] args) {
		// 메뉴선택 메소드 : 선택장애를 위한 음식 선택 메소드
		// 메소드 호출
		String menu_name = selectMenu();
		System.out.println("오늘 먹을 음식은 >> " + menu_name);

	}
	public static String selectMenu() {
		String[] name = {"분식", "모밀", "비빔밥", "라면", "에그타르트",
						"돈까스", "쌀국수", "치킨", "피자", "크림순대국" };
	
		Random rd = new Random();
		int index = rd.nextInt(name.length);
		 	
		return name[index];
	}

}
