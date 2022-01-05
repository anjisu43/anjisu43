import java.util.Scanner;

public class StudentSimulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student [] stuList = new Student[10]; //등록된 학생들의 모음
		int index = 0; // 등록할 학생의 위치
		System.out.println("======= SMHRD 성적관리 시스템 =======");
		                       
			
		while(true) {
				System.out.println("[1] 학생등록 [2] 성적수정  [3]종료");
				int choice = sc.nextInt();
				
				if(choice == 1&&index<stuList.length) {
					
					System.out.print("등록할 학생 이름 >> ");
					String name = sc.next();
					System.out.print("등록할 학생 학번 >> ");
					String stuNumber = sc.next();
					
					Student st = new Student(name, stuNumber);
					
					if(index<stuList.length) {
					stuList[index++] = st;
					}
					else {
						System.out.println("더 이상 학생을 등록할 수 없습니다.");
					} 
					
				}else if (choice == 2) {
					System.out.print("수정할 학생 이름 >> ");
					String name = sc.next();
					// 해당 학생을 검색(시퀀셜 서치 : 배열의 0번부터 순차적으로 비교)
					int stuIndex = -1; //찾는 학생의 위치
					for(int i = 0; i<index; i++) {
						if(name.equals(stuList[i].getName())) {
							stuIndex = i;
						}
					}
					if(stuIndex==-1) {
						System.out.println("등록된 학생이 없습니다.");
					}else  {
						// 1. 한번에 한과목 수정
						// 2. 한번에 3과목 모두 수정
						System.out.println("수정할 과목을 선택하세요.");
						System.out.println("[1]Java [2]Web [3]Iot [4]끝");
						int choiceSub = sc.nextInt();
						if(choiceSub==4) {
							
							System.out.println("과목 수정을 마칩니다.");}
					  
						while(true) {
							if(choiceSub==1) {
								  System.out.print("몇 점으로 수정하시겠습니까? >>");
									int score = sc.nextInt();
								stuList[stuIndex].changeJava(score);
								
							}else if(choiceSub==2) {
								  System.out.print("몇 점으로 수정하시겠습니까? >>");
									int score = sc.nextInt();
								stuList[stuIndex].changeWeb(score);
													
							}else if(choiceSub==3) { 
								  System.out.print("몇 점으로 수정하시겠습니까? >>");
									int score = sc.nextInt();
								stuList[stuIndex].changeIot(score);							
							}	
							System.out.println("수정이 완료되었습니다.");
							break;
						
					
					}
				}	
				}else if (choice == 3) { 
					break;
				}
		}

	}

}

