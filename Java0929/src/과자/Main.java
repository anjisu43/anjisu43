package ����;

import upcasting.�º�;

public class Main {

	public static void main(String[] args) {
		My my = new My();
		
		�ٳ���ű banana = new �ٳ���ű();
		my.eat(banana);
		
		��Ĩ sun = new ��Ĩ();
		my.eat(sun);
		
		���ĸ� onion = new ���ĸ�();
		my.eat(onion);
		
		Snack snak = onion;
		���ĸ� oni2 = (���ĸ�)snak;		
		oni2.sourc();
		
		System.out.println();
		
				
	}

}
