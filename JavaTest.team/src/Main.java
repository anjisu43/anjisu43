import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		

		StoreController st = new StoreController();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("[1]음식점보기 [2]미용실보기 [3]상세보기 [4]평점보기 [5]종료 >> ");
			int num = sc.nextInt();
			if (num==1) {
				System.out.println("====음식점보기====");
				st.getRestaurent();
			}else if (num==2) {
				System.out.println("====미용실보기====");
				st.getSalon();
			}else if (num==3) {
				System.out.println("====상세정보====");
				System.out.print("가게명 입력 : ");
				String n = sc.next();
				st.point(n);
			}else if (num==4) {
				st.totalPoint();
			}else if (num==5) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("정확한 숫자를 입력해 주세요.");
			}
		}

	}

}
