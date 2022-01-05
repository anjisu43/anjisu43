
public class 이차원배열 {

	public static void main(String[] args) {

		int[][] array = new int[4][4];

		// array[0][0] = 5;
		// array[0][1] = 10;
		// array[0][2] = 15;
		// array[0][3] = 20;

		// array[1][0] = 3;
		// array[1][1] = 6;
		// array[1][2] = 9;
		// array[1][3] = 12;
		int data = 1;

		for (int i = 0; i < array.length; i++) {
			for (int a = 0; a < array[0].length; a++) {
				array[i][a] = data;
				data++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int a = 0; a < array[0].length; a++) {
				System.out.print(array[i][a] + " ");

			}
		}
	}

}
