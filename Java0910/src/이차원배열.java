
public class 이차원배열 {

	public static void main(String[] args) {
		int [][] array = new int [5][5];
		
		int data =21;
		
		for(int i = 0; i < array.length; i++) {
			for(int a= 0; a<array[0]. length ; a++) {	
				array[i][a] = data;						
				data++;
			} 
		}
		for (int i =0; i<array.length; i++) {
			
			for(int a= 4; a>=0 ; a--) {
				System.out.print(array[i][a]+"\t");					
				}
				System.out.println();
				
			}
		}
	

	}


