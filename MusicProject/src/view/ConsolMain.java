package view;

import java.util.Scanner;

import controller.MusicPlayer;

// ȭ��ǥ�� + ���α׷� ���� ��
public class ConsolMain {
	public static void main(String[] args) {
	System.out.println("==========================");
	System.out.println("**************************");
	System.out.println("*******Music Player*******");
	System.out.println("**************************");
	System.out.println("==========================");
	System.out.println("���� �÷��̾� ����!!");
	Scanner sc = new Scanner(System.in);
	MusicPlayer player = new MusicPlayer();
	
	while(true) {
	System.out.print("[1]��� [2]���� [3]������ [4]������ [5]���� >> ");
	int choice = sc.nextInt();
	
		if(choice == 1) {// ���
			String musicInfo = player.play();
			System.out.println("���� "+ musicInfo +" �뷡�� ������Դϴ�.");
		}else if(choice ==2) {// ����
			player.stop();
			System.out.println("�뷡�� �Ͻ����� �Ͽ����ϴ�.");
			
			
		}else if(choice ==3) {// ������
			String musicInfo = player.prePlay();
			if(musicInfo == null) {
				System.out.println("��� ������ �������� �����ϴ�.");			
			}else {			
			System.out.println("���� "+ musicInfo +" �뷡�� ������Դϴ�.");
			}
		
		}else if(choice ==4) {// ������
			String musicInfo = player.nextPlay();
			if(musicInfo == null) {
				System.out.println("��� ������ �������� �����ϴ�.");			
			}else {			
			System.out.println("���� "+ musicInfo +" �뷡�� ������Դϴ�.");
			}
		}else if(choice ==5) {// ����
			player.stop();
			System.out.println("Player�� �����մϴ�.");
			break;
		}
		
	}	
	}

}
