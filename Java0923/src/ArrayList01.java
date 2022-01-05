import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList01 {

	public static void main(String[] args) {
		
		String[] name = new String[3];
		ArrayList<String> nameArray = new ArrayList<String>();
		
		// 값 초기화
		// 배열 첫번째에 값 초기화
		name[0] = "승환";
		
		//arrayList 값 추가
		nameArray.add("승환");
		nameArray.add("유선");
		
		//값 가져오기
		System.out.println(name[0]);
		System.out.println(nameArray.get(0));
		System.out.println(nameArray.get(1));
		
		//값 삽입
		nameArray.add(1, "대희");
		System.out.println(nameArray.get(1));
		System.out.println(nameArray.get(2));
		
		nameArray.add(2, "해도");
		System.out.println(nameArray.get(2));
		
		System.out.println("일차원 크기 : " + name.length);
		
		System.out.println("어레이리스트크기 : " + nameArray.size());
		
		//삭제
		//name[0] = ""; //일반 배열 -> 삭제라는 개념은 없고, 굳이 하고 싶다면 빈값으로 초기화는 가능! -> 길이가 정해져 있어 
		nameArray.remove(1);
		System.out.println(name);
		System.out.println(Arrays.toString(name));
		System.out.println(nameArray);
		//ArrayListSMS toString을 기본적으로 포함하고 있다
	}

}
