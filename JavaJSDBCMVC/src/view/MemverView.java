package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.MemberDAO;
import model.ModelVO;

public class MemverView {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==회원 관리 프로그램==");
		
		while(true) {
			System.out.println("1.회원가입  2.회원정보수정  3.회원삭제  4.전체회원정보  5.특정회원정보  6.종료");		
			System.out.print("메뉴 선택 >> ");
			int menu = sc.nextInt();
						
			if(menu==1) {
				System.out.println("==회원가입==");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				System.out.print("NICK : ");
				String nick = sc.next();
				
				MemberDAO dao = new MemberDAO();
				int cnt = dao.insert(id, pw, nick);
				
				//6.명령 후 처리
				if(cnt>0) {
					System.out.println("회원가입 성공!");
				}else {
					System.out.println("회원가입 실패ㅠ");
				}
								
			}else if(menu==2) {		
				
			}else if(menu==3) {
				
			}else if(menu==4) {		
				MemberDAO dao = new MemberDAO();
				ArrayList<ModelVO> al = dao.selectALL();
				
				//for_each
				for(:) {
					
				}
				
			}else if(menu==5) {
				
			}else if(menu==6) {
				System.out.println("프로그램 종료!");
				break;
			}
		}

	}
	
	
	
	
	
	
	
	
	
	

}
