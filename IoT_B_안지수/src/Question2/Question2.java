package Question2;

public class Question2 {

	public static void main(String[] args) {
		
		TV t = new TV();
		t.channel = 7;
		t.color = "red";
		t.print();
		t.channelup();
		t.channelup();
		t.print();
		t.color = "black";
		t.channelDown();
		t.print();
	}

}
