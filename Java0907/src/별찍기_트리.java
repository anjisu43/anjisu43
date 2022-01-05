
public class º°Âï±â_Æ®¸® {

	public static void main(String[] args) {
		
		for (int space = 6,star=1 ; space>=4; space--,star+=2) {
			for (int i = 0; i<space ; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < star; i++) {

				System.out.print("*");
			}
			System.out.println();
		}
		for (int space = 5,star=3 ; space>=3; space--,star+=2) {
			for (int i = 0; i<space ; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < star; i++) {

				System.out.print("*");
			}
			System.out.println();
		}
		for (int space = 5,star=3 ; space>=2; space--,star+=2) {
			for (int i = 0; i<space ; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < star; i++) {

				System.out.print("*");
			}
			System.out.println();
		}
		for (int space = 5,star=3 ; space>=1; space--,star+=2) {
			for (int i = 0; i<space ; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < star; i++) {

				System.out.print("*");
			}
			System.out.println();
		}
		int star = 1;
		while(star<4) {
			System.out.println("     ***");
			star++;
		}

	}

}
