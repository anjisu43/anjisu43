package ex02;

public class Triangle extends Figure{
	// 밑변 *높이/2
	
	private double base;
	private double height;
	public static String name = "삼각형";
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	// 메소드 오버라이딩 : 재정의
	public double calArea() {
		return base * height/2;
	}
	public static String getName() {
		return name;
	}
	
	
}
