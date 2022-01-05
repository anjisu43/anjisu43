package upcasting;

public class SmartPhone extends Phone{
	
	public void call() {
		System.out.println("빅스비 전화 걸어줘");
	}
	
	public void Wifi() {
		System.out.println("인터넷을 연결하다");
	}
	public void callSend() {
		System.out.println("빅스비 전화 받아");
	}

}
