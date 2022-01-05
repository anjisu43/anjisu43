
import java.util.ArrayList;

public class StoreController {

	ArrayList<Restaurant> r; 
	ArrayList<Salon> s; 
	
	public StoreController() {
		r = new ArrayList<Restaurant>();
		r.add(new Restaurant("해성식당","음식점",100.0,100.0,100.0,100.0));
		r.add(new Restaurant("정림이네","음식점",83.2,92.2,54.9,81.1));
		r.add(new Restaurant("왕뼈사랑","음식점",85.2,92.1,64.9,90.1));
		s = new ArrayList<Salon>();
		s.add(new Salon("박승철","미용실",39.2,88.6,77.7));
		s.add(new Salon("이가자","미용실",98.2,68.6,87.7));
		s.add(new Salon("리안","미용실",37.2,28.6,17.7));
	}

	public void getRestaurent() {
		for (int i = 0; i < r.size();i++) {
			Restaurant rr = r.get(i);
			System.out.println((i+1)+". "+rr.name+"\t"+"평점 : "+rr.grade());
		}
		
	}

	public void getSalon() {
		for (int i = 0; i < s.size();i++) {
			Salon ss = s.get(i);
			System.out.println((i+1)+". "+ss.name+"\t"+"평점 : "+ss.grade());
		}
	}

	public void point(String name) {
		System.out.println("가게명 : "+name);
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
				System.out.println("평점 : "+rr.grade());
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
				System.out.println("평점 : "+ss.grade());
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
