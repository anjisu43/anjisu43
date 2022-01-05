
public class Machine {
	
	// 각각의 인형을 기계에 담기
//	public void run(Pika pika) {
//		pika.get();
//	}
//	public void run(Piri piri) {
//		piri.get();
//	}
//	public void run(Kkobuk kkobuk) {
//		kkobuk.get();
//	}
	
	// 하위클래스를 포괄할 수 있는 메소드 생성 -> 업캐스팅(하위->상위)
	public void run(Doll doll) {
		doll.get();
	}
	

}
