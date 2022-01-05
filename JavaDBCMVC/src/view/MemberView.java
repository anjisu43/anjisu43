package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.MemberDAO;
import model.ModelVO;

public class MemberView {

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
				ModelVO vo = new ModelVO(id,pw,nick);
				
				int cnt = dao.insert(vo);
				
				//6.명령 후 처리
				if(cnt>0) {
					System.out.println("회원가입 성공!");
				}else {
					System.out.println("회원가입 실패ㅠ");
				}
								
			}else if(menu==2) {		
				
				System.out.println("회원수정서비스");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.println("1.PW 2.NICK");
				String choice = sc.next();
				System.out.print("Update Data : ");
				String data = sc.next();
				
				MemberDAO dao = new MemberDAO();
				dao.update(id, choice, data);
				
				if(dao.update(id, choice, data)>0) {
				
					System.out.println("수정성공");
				}else {
					System.out.println("수정실패");
				}	
				
			}else if(menu==3) {
				
			}else if(menu==4) {		
				MemberDAO dao = new MemberDAO();
				ArrayList<ModelVO> al = dao.selectALL();
				
				//for_each
				//배열, 어레이리스트안에 있는 값을 다룰 때 효율적으로 사용
				//for(배열/어레이리스트 안에 들어있는 요소를 임시적으로 사용할 이름:배열/어레이리스트 이름(레퍼런스변수명))
				
				for(ModelVO vo:al) {
					System.out.println("ID: "+ vo.getId());
					System.out.println("PW : "+ vo.getPw());
					System.out.println("NIKC : "+ vo.getNick());
					System.out.println("=====================");
				}
				
			}else if(menu==5) {
				System.out.println("==특정 회원정보 출력==");
				System.out.print("ID 입력 : ");
				String id = sc.next();
				
				MemberDAO dao = new MemberDAO();
				ModelVO vo = dao.selectOne(id);

				System.out.println("ID: "+ vo.getId());
				System.out.println("PW : "+ vo.getPw());
				System.out.println("NIKC : "+ vo.getNick());
				
			}else if(menu==6) {
				System.out.println("프로그램 종료!");
				break;
			}
		}

}
}
