import java.util.Random;

public class Festival0919_03 {

	public static void main(String[] args) {
		Random rd = new Random();
		int [] num = new int[8];
		int a = 0;
		System.out.print("배열에 있는 모든 값 : ");
		for(int i=0; i<num.length; i++) {
			num[i] = rd.nextInt(100);
			
			System.out.print(num[i] + " ");
		}
		
		int max = num[0];
		
		for(int i = 1; i<num.length; i++) {
			if(num[i]>max) {
				max = num[i];
			}
		}
		System.out.print("\n"+"가장 큰 값 : "+max);
		
		int mini = num[0];
		for(int i = 1; i<num.length; i++) {
			if(num[i]<mini) {
				mini = num[i];
			}
		}
		System.out.println("\n"+"가장 작은 값 : " + mini);
	
		

	}

}
