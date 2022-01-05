
public class º°Âï±â {

	public static void main(String[] args) {
		// *** *
//		    ** **
//		     * ***
//		  *** *
//		  **  **
//		  *   ***

		for (int up = 1, down = 3; up <= 3; up++, down--) {
			for (int i = 0; i < up; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < down; i++) {

				System.out.print("*");
			}
			for (int i = 0; i < down; i++) {
				
				System.out.print(" ");
			}
			for (int i = 0; i < up; i++) {
				System.out.print("*");
			}

			System.out.println(" ");}
		
		for (int up = 1, down = 3; up <= 3; up++, down--) {
			for (int i = 0; i < down; i++) {
				System.out.print("*");
			}
			for (int i = 0; i < up; i++) {

				System.out.print(" ");
			}
			for (int i = 0; i < up; i++) {
				
				System.out.print("*");
			}
			for (int i = 0; i < down; i++) {
				System.out.print(" ");
			}

			System.out.println(" ");}


	}

}