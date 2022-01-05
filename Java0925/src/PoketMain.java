import java.util.ArrayList;
import java.util.Scanner;

public class PoketMain {

   public static void main(String[] args) {
      
	   Scanner sc= new Scanner(System.in);
	   ArrayList<Poketmon> poktList = new ArrayList<Poketmon>();
      //포켓몬 수는 정확히 알수 없다. 
      //포켓몬 도감에 몇마리가 들어가야하는지 알수 없다
     for(int i = 0; i<5; i++) { 
    	System.out.print("이름 입력 >> ");
	    String name = sc.next();
	    System.out.print("타입 입력 >> ");
	    String type = sc.next();
	    System.out.println("공격력 입력 >> ");
	    int attack = sc.nextInt();
	    System.out.println("방어력 입력 >> ");
	    int sheild = sc.nextInt();
	    System.out.println("체력 입력 >>");
	    int hp = sc.nextInt();
	    
	  Poketmon poket = new Poketmon(name, type, attack, sheild, hp);
	  poktList.add(poket);
     }
	   //포켓몬 도감이 될 어레이 리스트
      Poketmon pika = new Poketmon("피카츄", "번개", 80, 60, 70);
      Poketmon piri = new Poketmon("파이리", "불", 90, 40, 50);
      Poketmon ggobuk = new Poketmon("꼬북이", "물", 60, 70, 65);
	  Poketmon purin = new Poketmon("푸린", "노래", 80, 30, 40);
	  Poketmon ddogas = new Poketmon("또가스", "가스", 90, 40, 20);
      
      //포켓몬도감 추가
      poktList.add(pika);
      poktList.add(piri);
      poktList.add(ggobuk);
      poktList.add(purin);
      poktList.add(ddogas);
      
      System.out.println("피카츄 공격력 :"+poktList.get(0).getAttack());
      
      //포켓몬 도감 만들기 5마리
      //포켓몬 확인
      System.out.println("===포켓몬 리스트 출력===");
      for(int i = 0; i < poktList.size(); i++) {
    	  String name = poktList.get(i). getName();
    	  System.out.println((i+1)+"."+name);
      }
      
      // 포켓몬 두마리 선택
      
      System.out.print("첫번째 포켓몬 번호 입력 >> ");
      int num1 = sc.nextInt();
      System.out.print("두번째 포켓몬 번호 입력 >> ");
      int num2 = sc.nextInt();
      
      int attack1 = poktList.get(num1-1).getAttack();
      int attack2 = poktList.get(num2-1).getAttack();      
      
      if(attack1 > attack2) { 
    	  // 첫번째 포켓몬이 이겼습니다!
    	  System.out.println(poktList.get(num1-1).getName()+" 승리!");
      }
      else if(attack2>attack1) {
    	  // 두번째 포켓몬이 이겼습니다!
    	  System.out.println(poktList.get(num2-1).getName()+" 승리!");
      }
      else {
    	  // 무승부입니다!
    	  System.out.println("무승부입니다..");
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   }

}