package Vending_Machine;

public class Vending_Machine {
	
	private int money;
	
	public int coin(int input_money) {
		money = input_money;
		return money;
	}
	
	public int a(int coke) { 
		coke = 1000; 
		int return_m = money-coke;
		return return_m;
	}
	public int b(int sprite) { 
		sprite = 1000; 
		int return_m = money-sprite;
		return return_m;
	}
	public int c(int milk) { 
		milk = 800; 
		int return_m = money-milk;
		return return_m;
	}
	public int d(int choco_milk) { 
		choco_milk = 900; 
		int return_m = money-choco_milk;
		return return_m;
	}
	public int e(int ion) { 
		ion = 1300; 
		int return_m = money-ion;
		return return_m;
	}
	public int f(int coffee) { 
		coffee = 1500; 
		int return_m = money-coffee;
		return return_m;
	}
}
