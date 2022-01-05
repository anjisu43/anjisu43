package 과자;

import upcasting.태블릿;

public class Main {

	public static void main(String[] args) {
		My my = new My();
		
		바나나킥 banana = new 바나나킥();
		my.eat(banana);
		
		썬칩 sun = new 썬칩();
		my.eat(sun);
		
		양파링 onion = new 양파링();
		my.eat(onion);
		
		Snack snak = onion;
		양파링 oni2 = (양파링)snak;		
		oni2.sourc();
		
		System.out.println();
		
				
	}

}
