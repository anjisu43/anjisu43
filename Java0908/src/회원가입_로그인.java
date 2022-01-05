import java.util.Scanner;

public class 회원가입_로그인 {

	public static void main(String[] args) {
		// 1.회원가입 2.로그인 3.종료
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====회원관리 시스템====");
		String[] id = {"","",""};
		String[] pw = {"","",""};
		int i = 0;
		String input_id; 
		String input_pw;
		
		while(true) {
			
			System.out.println("1.회원가입 2.로그인 3.종료");
			
			int choice = sc.nextInt();
			
			if(choice==1) {//회원가입
				System.out.println("===회원가입===");
				System.out.print("id 입력 : ");
				id[i] = sc.next();
				System.out.print("pw 입력 : ");
				pw[i] = sc.next();
				i++;
				System.out.println("가입성공");
				
			}
			else if(choice==2) {//로그인
				System.out.println("===로그인===");
				System.out.print("id 입력 : ");
								
					input_id = sc.next();
				
				System.out.print("pw 입력 : ");	
					
					input_pw = sc.next();
					
					
				//컴퓨터야 배열안에 사용자가 입력한 input_id 와 input_pw 가 있다면
				//로그인 성공이라고 출력하고, 아니라면 로그인 실패로 출력해줘
				//로그인 성공 실패 = count  변수에 저장
				int count = 0;
				for(int a=0;a<id.length;a++) {
					if(id[a].equals(input_id)&&pw[a].equals(input_pw)) {
						System.out.println("로그인 성공!");
						count++;
					}
				}
				if(count==0) {
					System.out.println("로그인 실패ㅠ");
				}
			}
				 
					
				
			else if(choice==3) {//프로그램 종료
				System.out.println("===프로그램을 종료합니다===");	
				break;
			}
			else {
				System.out.println("번호를 올바르게 입력하세요!!");
			}
	
		
		}
		
		

	}

}
