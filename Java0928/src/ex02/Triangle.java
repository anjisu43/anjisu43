package ex02;

public class Triangle extends Figure{
	// �غ� *����/2
	
	private double base;
	private double height;
	public static String name = "�ﰢ��";
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	// �޼ҵ� �������̵� : ������
	public double calArea() {
		return base * height/2;
	}
	public static String getName() {
		return name;
	}
	
	
}
