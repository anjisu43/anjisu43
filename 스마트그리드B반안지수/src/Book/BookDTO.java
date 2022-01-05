package Book;

public class BookDTO {
	private String id;
	private String pw;
	private String nick;
	private String email;
	private String tel;
	
	//»ý¼ºÀÚ
	public BookDTO(String id, String pw, String nick, String email, String tel) {
		
		this.id = id;
		this.pw = pw;
		this.nick = nick;
		this.email = email;
		this.tel = tel;
		
		
	}
	
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getNick() {
		return nick;
	}
	public String getEmail() {
		return email;
	}
	public String getTel() {
		return tel;
	}
	
}
