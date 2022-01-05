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
		System.out.println("TV의 현재 채녈은 : "+ channel+"이고, Tv의 색깔은 "+color+"입니다.");
	}
	public void channelup() {
		channel = channel+1;
	}
	public void channelDown() {
		channel = channel-1;
	}
	


}
