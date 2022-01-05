package controller;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;
import model.Music;

// 뮤직 플레이어 핵심 알고리즘
// Music과 ConsolMain의 중간다리

public class MusicPlayer {
	private ArrayList<Music> musicList;
	private int currentIndex; // 뮤직플레이어에서 현재 재생중이 노래의 인덱스
	private MP3Player mp3 = new MP3Player();
	
	public MusicPlayer() {
		musicList = new ArrayList<Music>();//빈 ArrayList 생성
		Music m = new Music("Butter", "BTS", 180, "작곡가1","C:\\Users\\smhrd\\Desktop\\music\\bts.mp3");
		musicList.add(m);// 노래 추가
		musicList.add(new Music("헤픈우연", "Heize", 200,"작곡가1", "C:\\Users\\smhrd\\Desktop\\music\\haize_real.mp3")); // 노래 추가
		musicList.add(new Music("Next Level", "aespa", 200, "작곡가1","C:\\Users\\smhrd\\Desktop\\music\\next.mp3")); // 노래 추가
	}

	public String play() {
		// 노래 목록중에서 첫번째 노래를 찾아 재생
		Music m = musicList.get(currentIndex);
		
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		
		String path = m.getMusicPath();
		mp3.play(path);
		// 노래제목(가수)
		return m.getSongName() + "("+m.getSinger()+")";
	}

	public String nextPlay() {
		// 1. 노래 리스트에서 다음곡을 꺼내고
		
		if(musicList.size()-1 > currentIndex) {			
			Music m = musicList.get(++currentIndex);
			
			if(mp3.isPlaying()) {
				mp3.stop();
				}
				
			String path = m.getMusicPath();
			mp3.play(path);
			// 2. 노래제목(가수) 형태로 리턴
			return m.getSongName() + "("+m.getSinger()+")";
		}else {
			return null;
		}
		
	
	}
	public String prePlay() {
		// 1. 노래 리스트에서 다음곡을 꺼내고

		if(0 < currentIndex) {			
			Music m =  musicList.get(--currentIndex);
			if(mp3.isPlaying()) {
				mp3.stop();
				}			
			
			String path = m.getMusicPath();
			mp3.play(path);
			// 2. 노래제목(가수) 형태로 리턴
			
			return m.getSongName() + "("+m.getSinger()+")";
			
		}else {
			return null;
		}
	}

	public void stop() {
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		
	}



}
