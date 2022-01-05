import java.util.Random;

public class Festival0918_01 {

	public static void main(String[] args) {
		
	int[] number = new int[6];

	Random rd = new Random();
	
	for(int i=0; i<number.length; i++) {
		number[i] = rd.nextInt(45)+1;
		
		for(int a = 0; a < i ; a++) {
			if(number[i]==number[a]) {
				i--;
				break;
			}
		}
	}
	for(int i = 0; i < number.length; i++) {
		System.out.println("행운의 숫자 : " + number[i]);
	}
	
}

}
