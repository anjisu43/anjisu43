
public class Info {//voclass

	private String name;
	private int age;
	
	//사용자 정의 생성자
	public Info(String name, int age) {
		this.name = name;
		this.age = age;		
	}
	public Info() {
		// 오버로딩 - 매개변수의 갯수가 다르면 쌉가능
		//       - 매개변수의 타입이 다르면 쌉가능
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Info [name=" + name + ", age=" + age + "]";
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
