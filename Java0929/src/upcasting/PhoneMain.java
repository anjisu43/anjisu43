package upcasting;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone phone = new Phone();
		SmartPhone smart = new SmartPhone();
		�º� t = new �º�();
		
		phone.call();
		smart.call();
		phone.callSend();
		
		//��ĳ����
		//�ڽ�Ŭ���� Ÿ���� ��ü�� �θ�Ÿ�� ��ü�� �־���
		//=>�ڵ� ����ȯ
		Phone phone2 = smart;
		
		phone2.callSend();
		
		((SmartPhone)phone2).Wifi();
		// �ٿ� ĳ���� =  ��ĳ���� �� ���� �ڽ� Ŭ���� Ÿ������ �Ͻ��� ����ȯ
		SmartPhone smart2 = (SmartPhone) phone2;
		
		smart2.Wifi();
		
		Phone ph = t;
		
		((�º�)ph).drawing();
		
		
		

	}

}
