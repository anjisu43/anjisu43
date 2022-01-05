import java.util.Scanner;

public class SelectSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int [5];
		for(int i = 0; i<array.length;i++) {
			System.out.print((i+1)+"¹øÂ° °ª >> ");
			array[i] = sc.nextInt();
		}
		for(int i =0; i<array.length; i++) {
			
			int maxNum = array[i];
			int maxNumIndex = i;
			for(int j = i+1; j<array.length; j++) {
				if(maxNum<array[j]) {
					maxNumIndex = j;
					maxNum = array[j];
				}
			}
			
			int temp = array[i];
			array[i]=  array[maxNumIndex];
			array[maxNumIndex] = temp;
		}
		
		for(int i =0; i<array.length;i++) {
			System.out.print(array[i]+ " ");
			}

	}

}
