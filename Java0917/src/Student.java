
public class Student {
	
	//�ʵ�
	private String name; //	�̸� 
	private String stuNumber; //	�й�
	private int grade; //	�г�
	private int java; // �������
	private int web;  // ��������
	private int iot;  // ��������
 	
	//	�޼ҵ�
	// ������ : ��ü�� �����ϴ� �޼ҵ�
	// 1. ��ȯ Ÿ���� ����(void�� ���� x)
	// 2. �޼ҵ� �̸��� Ŭ���� �̸��� ����
	// 3. �޸𸮿� ��ü ������ �Ҵ�
	// 4. �����ÿ� �� �ѹ��� ȣ��
	public Student(String name, String stuNumber) {
		this.name = name;
		this.stuNumber = stuNumber;
		System.out.println("�л� ��ü ����");
	}
	// Java ������ �����ϴ� �޼ҵ�
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
