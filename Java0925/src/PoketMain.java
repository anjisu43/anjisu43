import java.util.ArrayList;
import java.util.Scanner;

public class PoketMain {

   public static void main(String[] args) {
      
	   Scanner sc= new Scanner(System.in);
	   ArrayList<Poketmon> poktList = new ArrayList<Poketmon>();
      //���ϸ� ���� ��Ȯ�� �˼� ����. 
      //���ϸ� ������ ����� �����ϴ��� �˼� ����
     for(int i = 0; i<5; i++) { 
    	System.out.print("�̸� �Է� >> ");
	    String name = sc.next();
	    System.out.print("Ÿ�� �Է� >> ");
	    String type = sc.next();
	    System.out.println("���ݷ� �Է� >> ");
	    int attack = sc.nextInt();
	    System.out.println("���� �Է� >> ");
	    int sheild = sc.nextInt();
	    System.out.println("ü�� �Է� >>");
	    int hp = sc.nextInt();
	    
	  Poketmon poket = new Poketmon(name, type, attack, sheild, hp);
	  poktList.add(poket);
     }
	   //���ϸ� ������ �� ��� ����Ʈ
      Poketmon pika = new Poketmon("��ī��", "����", 80, 60, 70);
      Poketmon piri = new Poketmon("���̸�", "��", 90, 40, 50);
      Poketmon ggobuk = new Poketmon("������", "��", 60, 70, 65);
	  Poketmon purin = new Poketmon("Ǫ��", "�뷡", 80, 30, 40);
	  Poketmon ddogas = new Poketmon("�ǰ���", "����", 90, 40, 20);
      
      //���ϸ󵵰� �߰�
      poktList.add(pika);
      poktList.add(piri);
      poktList.add(ggobuk);
      poktList.add(purin);
      poktList.add(ddogas);
      
      System.out.println("��ī�� ���ݷ� :"+poktList.get(0).getAttack());
      
      //���ϸ� ���� ����� 5����
      //���ϸ� Ȯ��
      System.out.println("===���ϸ� ����Ʈ ���===");
      for(int i = 0; i < poktList.size(); i++) {
    	  String name = poktList.get(i). getName();
    	  System.out.println((i+1)+"."+name);
      }
      
      // ���ϸ� �θ��� ����
      
      System.out.print("ù��° ���ϸ� ��ȣ �Է� >> ");
      int num1 = sc.nextInt();
      System.out.print("�ι�° ���ϸ� ��ȣ �Է� >> ");
      int num2 = sc.nextInt();
      
      int attack1 = poktList.get(num1-1).getAttack();
      int attack2 = poktList.get(num2-1).getAttack();      
      
      if(attack1 > attack2) { 
    	  // ù��° ���ϸ��� �̰���ϴ�!
    	  System.out.println(poktList.get(num1-1).getName()+" �¸�!");
      }
      else if(attack2>attack1) {
    	  // �ι�° ���ϸ��� �̰���ϴ�!
    	  System.out.println(poktList.get(num2-1).getName()+" �¸�!");
      }
      else {
    	  // ���º��Դϴ�!
    	  System.out.println("���º��Դϴ�..");
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   }

}