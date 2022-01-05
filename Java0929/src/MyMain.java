
public class MyMain {

	public static void main(String[] args) {
		// 기게를 통해 각가의 인형을 뽑아주세용
		Machine m = new Machine();
		
		Pika pika = new Pika();
		m.run(pika);
		pika.get2();
		
		Kkobuk kkobuk = new Kkobuk();
		m.run(kkobuk);
		
		Piri piri = new Piri();
		m.run(piri);
		

	}

}
