
public class MyMain {

	public static void main(String[] args) {
		// ��Ը� ���� ������ ������ �̾��ּ���
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
