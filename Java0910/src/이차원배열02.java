
public class 이차원배열02 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];

		int data = 21;

		for (int i = 0; i < array.length; i++) {
			for (int a = 0; a < array[0].length; a++) {
				array[i][a] = data;
				data++;
			}
		}
		for (int i = 4; i >=0  ; i--) {

			for (int a = 4; a >=0 ; a--) {
				System.out.print(array[a][i] + "\t");
			}
			System.out.println();
		}

	}

}
