
public class 문자열 {

	public static void main(String[] args) {
		// Java에서 문자열을 표현하느 데이터타입 String(사용자 정의 타입)
		
		char c= 'A';
		String s = "A";
		String word = "Apple";  // 내부에는 char 배열이 구성되어있다.
		String msg = "안녕하세요. 점심시간이에요. 배고파요.";
		
		 char[] word_array = new char[5];
		 word_array[0] = 'A';
		 word_array[1] = 'p';
		 word_array[2] = 'p';
		 word_array[3] = 'l';
		 word_array[4] = 'e';
		
//		 String 타입의 유용한 기능
		 
//		 1. 문자열에서 특정 위치의 한 글자를 추출할 때 사용 : charAt
		 char result = word.charAt(0);
		 System.out.println(result);
		 
//		 2. 문자열을 특정 기호로 쪼개고 싶을 때 사용 : split
		 String wordList = "바나나,사과,배,포도";
		 String[] wordListSplit = wordList.split(",");
		 
		 System.out.println(wordListSplit[0]);
		 System.out.println(wordListSplit[1]);
		 System.out.println(wordListSplit[2]);
		 System.out.println(wordListSplit[3]);                                                                                                           
		 // 3. 특정 글자가 문자열에 포함되어있는지 알아보는 기능  :contains
		 
		 boolean result2 = msg.contains("점심");
		 
		 System.out.println(result2);
		 
		 
		 // 4. 문자열의 특정 글자를 다른 글자로 대체하는 기능 : replace
		 String result3 = msg.replace("배고파요." ,  "배고팡");
		 System.out.println(result3);
		 
		 // 5. 문자열 일부 구간을 잘라내는 기능 : substring
		 String result4 = msg.substring(0, 6);
		 System.out.println(result4);
		 
	

	}

}
