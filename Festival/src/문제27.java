import java.util.Scanner;

public class 문제27 {

	public static void main(String[] args) {
		System.out.println("====채점하기====");
		Scanner sc = new Scanner(System.in);
		
		String [] answer = new String[7];
		int sum =0;
		for(int i = 0; i<answer.length;i++) {
			answer[i] = sc.next();
			if(answer[i]=="o") {
				sum += 1;
			}else {
				sum=0;
			}
		}
		System.out.println(sum);

	}

}
