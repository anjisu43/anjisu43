package upcasting;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone phone = new Phone();
		SmartPhone smart = new SmartPhone();
		태블릿 t = new 태블릿();
		
		phone.call();
		smart.call();
		phone.callSend();
		
		//업캐스팅
		//자식클래스 타입의 객체를 부모타입 객체로 넣어줌
		//=>자동 형변환
		Phone phone2 = smart;
		
		phone2.callSend();
		
		((SmartPhone)phone2).Wifi();
		// 다운 캐스팅 =  업캐스팅 된 것을 자식 클래스 타입으로 일시적 형변환
		SmartPhone smart2 = (SmartPhone) phone2;
		
		smart2.Wifi();
		
		Phone ph = t;
		
		((태블릿)ph).drawing();
		
		
		

	}

}
