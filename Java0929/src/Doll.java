
public abstract class Doll {
	
	// 모든 인형 클래스의 공통 조상 -->
	
	// 추상 클래스(하위클래스로부터 추상화를 거쳐 나온 공통의 조상클래스)
	// : 추상 메소드를 하나라도 포함한 클래스를 의미
	// : 일반 메소드도 사용가능하다
	
	public abstract void get(); 
	//추상 메소드
	// : 로직을 정의할 수 있는 body{}가 없는 메소드를 추상메소드라고 한다.
	// : 추상메소드는 반드시!!! 하위클래스(상속받고있는) body를 정의해주어야한다!!
	// ==> 강제성!!(오버라이딩을 반드시 해줘야한다)
	// 키워드 : abstract
	
	public void get2() {
		System.out.println("되나...?");
	}
	

}
