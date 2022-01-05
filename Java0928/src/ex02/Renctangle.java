package ex02;

public class Renctangle extends Figure{
	
	private double width;
	private double height;
	public static String name = "사각형";
	
	public Renctangle(double width, double height) {
		this.width = width;
		this.height = height;
		
	}
	// 넓이 계산 메소드
	// 메소드 오버라이딩 : 재정의
	public double calArea() {
		return width * height;
	}
	public static String getName() {
		return name;
	}
	
	

}
