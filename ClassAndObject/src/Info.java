
public class Info {//voclass

	private String name;
	private int age;
	
	//����� ���� ������
	public Info(String name, int age) {
		this.name = name;
		this.age = age;		
	}
	public Info() {
		// �����ε� - �Ű������� ������ �ٸ��� �԰���
		//       - �Ű������� Ÿ���� �ٸ��� �԰���
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
