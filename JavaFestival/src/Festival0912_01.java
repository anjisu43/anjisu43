import java.util.Scanner;

public class Festival0912_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 >> ");
		int j = sc.nextInt();
			int [][] array = new int [j][j];
				
				int data =1;
				
				for(int i = 0; i < array.length; i++) {
					for(int a= 0; a<array[0]. length ; a++) {	
						array[i][a] = data;						
						data++;
					} 
				}
				
				for (int i =0; i<array.length; i++) {
					if(i%2==0) {
					for(int a= 0; a<array[0]. length ; a++) {					
						System.out.print(array[i][a]+"\t");					
						}					
					}else {
					for(int d= 4; d>=0 ; d--)
						System.out.print(array[i][d]+"\t");	}
							
					
					System.out.println();

	}

}
}