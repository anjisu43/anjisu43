package 전화_스마트폰;

public class 전화_스마트폰_Main {

	public static void main(String[] args) {
		class_전화 Phone = new class_전화();
		Phone.calling();
		Phone.answer();
		
		class_스마트폰 Sp = new class_스마트폰();
		Sp.answer();
		Sp.calling();
		Sp.MusicPlay();
		Sp.internet();
		
		태블릿 tb = new 태블릿();
		tb.calling();

	}
	

}
