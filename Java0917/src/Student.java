
public class Student {
	
	//필드
	private String name; //	이름 
	private String stuNumber; //	학번
	private int grade; //	학년
	private int java; // 과목과목
	private int web;  // 과목점수
	private int iot;  // 과목점수
 	
	//	메소드
	// 생성자 : 객체를 생성하는 메소드
	// 1. 반환 타입이 없다(void도 쓰지 x)
	// 2. 메소드 이름은 클래스 이름과 동일
	// 3. 메모리에 객체 공간을 할당
	// 4. 생성시에 딱 한번만 호출
	public Student(String name, String stuNumber) {
		this.name = name;
		this.stuNumber = stuNumber;
		System.out.println("학생 객체 생성");
	}
	// Java 점수를 수정하는 메소드
	 public void changeJava(int java) {
		 this.java = java;
	 }
	 public void changeWeb(int web) {
		 this.web = web;
	 }
	 public void changeIot(int iot) {
		  this.iot = iot;
	 }
	 public String getName() {
		 return name;
	 }

}
