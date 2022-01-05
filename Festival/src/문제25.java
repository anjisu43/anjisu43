
public class ¹®Á¦25 {

	public static void main(String[] args) {
		int[][] num = new int[5][5];
		int data = 1;
		
		for(int i = 0; i < num.length; i++) {
			for(int a= 0; a<num[0]. length ; a++) {	
				num[i][a] = data;						
				data++;
			} 
		}
		
		for(int i = 4; i>=0; i--) {
			for(int a= 0; a<num.length; a++) {
				System.out.print(num[a][i]+"\t");
			}System.out.println();
		}

	}

}
