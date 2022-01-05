package view;

import java.util.Scanner;

import controller.MusicPlayer;

// 화면표헌 + 프로그램 시작 점
public class ConsolMain {
	public static void main(String[] args) {
	System.out.println("==========================");
	System.out.println("**************************");
	System.out.println("*******Music Player*******");
	System.out.println("**************************");
	System.out.println("==========================");
	System.out.println("뮤직 플레이어 시작!!");
	Scanner sc = new Scanner(System.in);
	MusicPlayer player = new MusicPlayer();
	
	while(true) {
	System.out.print("[1]재생 [2]중지 [3]이전곡 [4]다음곡 [5]종료 >> ");
	int choice = sc.nextInt();
	
		if(choice == 1) {// 재생
			String musicInfo = player.play();
			System.out.println("현재 "+ musicInfo +" 노래가 재생중입니다.");
		}else if(choice ==2) {// 중지
			player.stop();
			System.out.println("노래를 일시정지 하였습니다.");
			
			
		}else if(choice ==3) {// 이전곡
			String musicInfo = player.prePlay();
			if(musicInfo == null) {
				System.out.println("재생 가능한 이전곡이 없습니다.");			
			}else {			
			System.out.println("현재 "+ musicInfo +" 노래가 재생중입니다.");
			}
		
		}else if(choice ==4) {// 다음곡
			String musicInfo = player.nextPlay();
			if(musicInfo == null) {
				System.out.println("재생 가능한 다음곡이 없습니다.");			
			}else {			
			System.out.println("현재 "+ musicInfo +" 노래가 재생중입니다.");
			}
		}else if(choice ==5) {// 종료
			player.stop();
			System.out.println("Player를 종료합니다.");
			break;
		}
		
	}	
	}

}
