
public class Personinfo {
	// 이름
	// 번호
	// 생일
	private String name;
	private String number;
	private String birth;
	
	public Personinfo(String name, String number, String birth) {
		super();
		this.name = name;
		this.number = number;
		this.birth = birth;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	// 정보를 수정/가져오기를 위해
	// get, set 활용
	
	

}
