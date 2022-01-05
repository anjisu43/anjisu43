package controller;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;
import model.Music;

// ���� �÷��̾� �ٽ� �˰���
// Music�� ConsolMain�� �߰��ٸ�

public class MusicPlayer {
	private ArrayList<Music> musicList;
	private int currentIndex; // �����÷��̾�� ���� ������� �뷡�� �ε���
	private MP3Player mp3 = new MP3Player();
	
	public MusicPlayer() {
		musicList = new ArrayList<Music>();//�� ArrayList ����
		Music m = new Music("Butter", "BTS", 180, "�۰1","C:\\Users\\smhrd\\Desktop\\music\\bts.mp3");
		musicList.add(m);// �뷡 �߰�
		musicList.add(new Music("���¿쿬", "Heize", 200,"�۰1", "C:\\Users\\smhrd\\Desktop\\music\\haize_real.mp3")); // �뷡 �߰�
		musicList.add(new Music("Next Level", "aespa", 200, "�۰1","C:\\Users\\smhrd\\Desktop\\music\\next.mp3")); // �뷡 �߰�
	}

	public String play() {
		// �뷡 ����߿��� ù��° �뷡�� ã�� ���
		Music m = musicList.get(currentIndex);
		
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		
		String path = m.getMusicPath();
		mp3.play(path);
		// �뷡����(����)
		return m.getSongName() + "("+m.getSinger()+")";
	}

	public String nextPlay() {
		// 1. �뷡 ����Ʈ���� �������� ������
		
		if(musicList.size()-1 > currentIndex) {			
			Music m = musicList.get(++currentIndex);
			
			if(mp3.isPlaying()) {
				mp3.stop();
				}
				
			String path = m.getMusicPath();
			mp3.play(path);
			// 2. �뷡����(����) ���·� ����
			return m.getSongName() + "("+m.getSinger()+")";
		}else {
			return null;
		}
		
	
	}
	public String prePlay() {
		// 1. �뷡 ����Ʈ���� �������� ������

		if(0 < currentIndex) {			
			Music m =  musicList.get(--currentIndex);
			if(mp3.isPlaying()) {
				mp3.stop();
				}			
			
			String path = m.getMusicPath();
			mp3.play(path);
			// 2. �뷡����(����) ���·� ����
			
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
