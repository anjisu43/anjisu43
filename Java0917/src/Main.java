
public class Main {

	public static void main(String[] args) {
		//학생 성적을 관리하는 시스템
		
		// 객체 만들기
		// 클래스명 변수명 = new 클래스명();
		
		// 생성자 : 클래스로부터 객체를 생성(메모리에 할당)
		Student stu1 = new Student("황해도", "140605");
		Student stu2 = new Student("승환", "130505");
		Student stu3 = new Student("서대희", "333333");
		
		stu1.changeJava(90);
		stu2.changeJava(85);
		stu3.changeJava(10);

	}

}
