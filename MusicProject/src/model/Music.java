package model;
// ���� �����͸� ǥ��
public class Music {
	//�뷡����, ����, ����, ����ð�, �۰, �ٹ���Ʈ
	private String songName;
	private String singer;
	private String lyrics;
	private int playTime;
	private String songWriter;
	private String albumArthPath;
	private String musicPath;//���� ���� ���

	//������ : ��ü�� ������ �� ȣ��Ǵ� �޼ҵ�
	//������ Ư¡ : �޼ҵ� ��ȯŸ���� ����(void�� �Ⱦ�), �޼ҵ� �̸��� Ŭ���� �̸��� ����
	//           ��ü ������ �� �ѹ��� ȣ��
	
	public Music(String songName, String singer, int playTime, String songWriter){
		this.songName = songName;
		this.singer = singer;
		this.playTime = playTime;
		this.songWriter = songWriter;	
		
	}
	// ������ �����ε� --> �Ȱ��� ������ �����
	// �޼ҵ��� �Ű������� ������, ������ Ÿ���� �ٸ��� ����
	
	public Music(String songName, String singer, 
			     int playTime, String songWriter, String musicPath) {
		this.songName = songName;
		this.singer = singer;
		this.playTime = playTime;
		this.songWriter = songWriter;
		this.musicPath = musicPath;
	}
	
	// �뷡������ ������ �޼ҵ�
	public String getSongName() {
		return songName;
	}
	public String getSinger() {
		return singer;
	}
	public String getMusicPath() {
		return musicPath;
	}

}
