import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		//10명이 들어갈 전화번호부 배열생성
		Scanner sc = new Scanner(System.in);
		
		Personinfo[] list = new Personinfo[10];
		
		System.out.print("이름 입력 >> ");
		String name = sc.next();
		
		System.out.print("번호 >> ");
		String number = sc.next();
		
		System.out.print("생일 입력 >> ");
		String birth = sc.next();
		
		Personinfo info = new Personinfo(name, number, birth);
//		info.setName(name);
//		info.setNumber(number);
//		info.setBirth(birth);
		
			
	    System.out.println(info.getName()); //name 값 가져오기
		System.out.println(info.getNumber()); //number 값 가져오기
		System.out.println(info.getBirth());// birth 값 가져오기
		
		list[0] = info;
		
		Personinfo info2 = new Personinfo("서민우","01096123941", "870520" );
		
		list[1] = info2;
		
		for(int i=0; i<list.length; i++) {
			
			System.out.print("이름 입력 >> ");
			String name1 = sc.next();
			
			System.out.print("번호 >> ");
			String number1 = sc.next();
			
			System.out.print("생일 입력 >> ");
			String birth1 = sc.next();
			
			Personinfo info3 = new Personinfo(name,number,birth);
			list[i] = info3;
		}
		System.out.print("이름 출력 >>"+list[1].getName());
		System.out.print("번호 출력 >>"+list[1].getNumber());
		System.out.print("생일 출력 >>"+list[1].getBirth());
			
			
		
		

	}

}
