
public class ex_01배열생성 {

	public static void main(String[] args) {

//		int    []   numbers = new        int    [4];
//	   배열타입   배열선언      변수         배열생성         선언한    배열크기
//		                                                         배열 타입과 동일
//	int 타입의 배열을 생성
//	배열의 이름은 array1
//	배열의 크기는 4

		int[] array1 = new int[4];

//		 배열에 값 집어넣기

		array1[0] = 10;

//		나머지 공간에도 값 집어넣기

		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;

//		배열의 길이 출력하기
//		선언한 배열의 크기 값을 출력
		System.out.println("배열의 길이 : "+array1.length);
	
//		배열의 값 출력하기
//		반복문
		System.out.print("배열 값 불러오기 : ");
		for(int i = 0; i < array1.length; i++) {
//			i가 0~3까지 증가함
//			i = 0>10
//		    i = 1>20
//		    i = 2>30
//		    i = 3>40
		    		
			System.out.print(array1[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
