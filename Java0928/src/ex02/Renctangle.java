package ex02;

public class Renctangle extends Figure{
	
	private double width;
	private double height;
	public static String name = "�簢��";
	
	public Renctangle(double width, double height) {
		this.width = width;
		this.height = height;
		
	}
	// ���� ��� �޼ҵ�
	// �޼ҵ� �������̵� : ������
	public double calArea() {
		return width * height;
	}
	public static String getName() {
		return name;
	}
	
	

}