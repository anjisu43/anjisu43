
public class Salon extends Store{

	double technology;
	double kindness;
	
	public Salon(String name, String event, double technology, double kindness, double price) {
		this.name = name;
		this.event = event;
		this.technology = technology;
		this.kindness = kindness;
		this.price = price;
	}
	
	@Override
	public double grade() {
		double a = (technology+kindness+price)/3;
		a = (int)(a*100);
		a = a/100;
		return a;
	}

	
}