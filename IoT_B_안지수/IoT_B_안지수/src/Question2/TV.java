package Question2;

public class TV {
	int channel;
	String color;
	
	public void channel(int Channel) {
		Channel = channel;
	}
	public void color(String Color) {
		Color = color;
	}
	public void print() {
		System.out.println("TV�� ���� ä���� : "+ channel+"�̰�, Tv�� ������ "+color+"�Դϴ�.");
	}
	public void channelup() {
		channel = channel+1;
	}
	public void channelDown() {
		channel = channel-1;
	}
	


}
