package entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public double cover() {
		if (((beer * 5) + (softDrink * 3) + (barbecue * 7)) < 30) {
			return 4.0;
		} else
			return 0;
	}

	public double feeding() {
		return (beer * 5) + (softDrink * 3) + (barbecue * 7);
	}

	public double ticket() {
		if (gender == 'M') {
			return 10.0;
		} else
			return 8.0;
	}

	public double total() {
		double valorTotal = feeding() + cover() + ticket();
		
		return valorTotal;
	}

}
