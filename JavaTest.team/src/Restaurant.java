
public class Restaurant extends Store{

	double survice;
	double flavor;
	double clean;
	
	public Restaurant(String name, String event, double survice, double flavor, double clean, double price) {
		this.name = name;
		this.event = event;
		this.survice = survice;
		this.flavor = flavor;
		this.clean = clean;
		this.price = price;
	}
	@Override
	public double grade() {
		double a = (survice+flavor+clean+price)/4;
		a = (int)(a*100);
		a = a/100;
		return a;
	}

}
