import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// 나이와 이름을 동시에 돌려주는 메소드를 만들고 싶다면? -> 클래스를 만들쟈!

		// 대희쌤의 나이는 22살입니다. 대희쌤의 나이를 저장하시오.
		int daeheeAge = 22;
		Scanner sc = new Scanner(System.in);

		// 어떤 한 변수 하나에다가 대희라는 이름과 22살이라는 나이를 저장하시오.
		Info member = new Info("서대희", 22);//<--default 생성자, VO(value object)
		
		member.setName("서대회무침");

//		member.setName("서대희");
		System.out.println(member);
//		member.setAge(22);
//		System.out.println(member.getAge());
//		
		Info member2 = new Info();
		
		System.out.println("회원정보를 입력하세용");
		String newName = sc.next();
		int newAge = sc.nextInt();
		
		member2.setName(newName);
		member2.setAge(newAge);
		
		System.out.println(member2.getName()+member2.getAge());
		
	


	}

}
