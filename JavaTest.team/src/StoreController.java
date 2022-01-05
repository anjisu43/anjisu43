
import java.util.ArrayList;

public class StoreController {

	ArrayList<Restaurant> r; 
	ArrayList<Salon> s; 
	
	public StoreController() {
		r = new ArrayList<Restaurant>();
		r.add(new Restaurant("�ؼ��Ĵ�","������",100.0,100.0,100.0,100.0));
		r.add(new Restaurant("�����̳�","������",83.2,92.2,54.9,81.1));
		r.add(new Restaurant("�ջ����","������",85.2,92.1,64.9,90.1));
		s = new ArrayList<Salon>();
		s.add(new Salon("�ڽ�ö","�̿��",39.2,88.6,77.7));
		s.add(new Salon("�̰���","�̿��",98.2,68.6,87.7));
		s.add(new Salon("����","�̿��",37.2,28.6,17.7));
	}

	public void getRestaurent() {
		for (int i = 0; i < r.size();i++) {
			Restaurant rr = r.get(i);
			System.out.println((i+1)+". "+rr.name+"\t"+"���� : "+rr.grade());
		}
		
	}

	public void getSalon() {
		for (int i = 0; i < s.size();i++) {
			Salon ss = s.get(i);
			System.out.println((i+1)+". "+ss.name+"\t"+"���� : "+ss.grade());
		}
	}

	public void point(String name) {
		System.out.println("���Ը� : "+name);
		for (int i = 0; i < r.size(); i++) {
			Restaurant rr = r.get(i);
			if (name.equals(rr.name)) {
				for (int j = 0; j < 10; j++) {
					System.out.print((j+1)*10+"\t");
				}
				System.out.println();
				for (int j = 10; j <= rr.grade(); j+=10) {
					System.out.print("*"+"\t");
				}
				System.out.println();
				System.out.println("���� : "+rr.grade());
			}
		}
		for (int i = 0; i < s.size(); i++) {
			Salon ss = s.get(i);
			if (name.equals(ss.name)) {
				for (int j = 0; j < 10; j++) {
					System.out.print((j+1)*10+"\t");
				}
				System.out.println();
				for (int j = 10; j <= ss.grade(); j+=10) {
					System.out.print("*"+"\t");
				}
				System.out.println();
				System.out.println("���� : "+ss.grade());
			}
		}
	}

	public void totalPoint() {
		for (int i = 100; i > 0; i-=10) {
			System.out.print(i+"\t");
			for (int j = 0; j < r.size(); j++) {
				Restaurant rr = r.get(j);
				if (rr.grade() >= i) {
					System.out.print("*"+"\t");
				} else {
					System.out.print(" "+"\t");
				}
			}
			for (int j = 0; j < s.size(); j++) {
				Salon ss = s.get(j);
				if (ss.grade() >= i) {
					System.out.print("*"+"\t");
				} else {
					System.out.print(" "+"\t");
				}
			}
			System.out.println();
		}
		System.out.print(" "+"\t");
		for (int i = 0; i < r.size(); i++) {
			Restaurant rr = r.get(i);
			System.out.print(rr.name+"\t");
		}
		for (int i = 0; i < s.size(); i++) {
			Salon ss = s.get(i);
			System.out.print(ss.name+"\t");
		}
		System.out.println();
	}
	
	
}
