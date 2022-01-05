package model;
// 음악 데이터를 표현
public class Music {
	//노래제목, 가수, 가사, 재생시간, 작곡가, 앨범아트
	private String songName;
	private String singer;
	private String lyrics;
	private int playTime;
	private String songWriter;
	private String albumArthPath;
	private String musicPath;//음원 파일 경로

	//생성자 : 객체를 생성할 때 호출되는 메소드
	//생성자 특징 : 메소드 반환타입이 없다(void도 안씀), 메소드 이름이 클래스 이름과 동일
	//           객체 생성시 딱 한번만 호출
	
	public Music(String songName, String singer, int playTime, String songWriter){
		this.songName = songName;
		this.singer = singer;
		this.playTime = playTime;
		this.songWriter = songWriter;	
		
	}
	// 생성자 오버로딩 --> 똑같은 변수명 사용함
	// 메소드의 매개변수의 갯수나, 데이터 타입이 다르면 성립
	
	public Music(String songName, String singer, 
			     int playTime, String songWriter, String musicPath) {
		this.songName = songName;
		this.singer = singer;
		this.playTime = playTime;
		this.songWriter = songWriter;
		this.musicPath = musicPath;
	}
	
	// 노래제목을 꺼내는 메소드
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
