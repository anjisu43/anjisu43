
public class º°Âï±â3 {

	public static void main(String[] args) {
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		//***********
		// *********
		//  *******
		//   *****
		//    ***
		//     *
		System.out.println();

		for (int space = 6,star=1 ; space>=1; space--,star+=2) {
			for (int i = 0; i<space ; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < star; i++) {

				System.out.print("*");
			}
			System.out.println();
	
			}
		for (int space = 2,star=9 ; space<=6; space++,star-=2) {
			for (int i = 0; i<space ; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < star; i++) {

				System.out.print("*");
			}
			System.out.println();
	
			}
	
	

	}
	}
