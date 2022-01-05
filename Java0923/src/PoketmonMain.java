import java.util.ArrayList;

public class PoketmonMain {

	public static void main(String[] args) {
		
		// 포켓몬 수는 정확히 알 수 없다.
		// 포켓몬 도감에 몇마리가 들어가야하는지 알 수 없다.
		
		ArrayList<Poketmon> poktList = new ArrayList<Poketmon>();
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
		
		System.out.println("피카츄 공격력 : " + poktList.get(0).getAttack());
		System.out.println("또가스 체력 : " + poktList.get(0).getHp());
		

	}

}
