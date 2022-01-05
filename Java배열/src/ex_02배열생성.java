
public class ex_02배열생성 {

	public static void main(String[] args) {
		// 배열 선언, 생성, 값 집어넣기를 한번에 진행
		int [] array1 = {10,20,30,40};
		
		// 배열의 크기 출력
		System.out.println("배열의 길이 : "+array1.length);
		// 배열 안에 있는 값 출력
		
		System.out.print("배열의 값 불러오기 : ");
		for(int i = 0; i<array1.length; i++) {
		System.out.print(array1[i]+" ");
		}
		

	}

}
