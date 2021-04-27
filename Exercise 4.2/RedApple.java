import java.util.Scanner;
public class RedApple extends Apple {//subclass for Apple
	Scanner s = new Scanner(System.in);
	String country;
	double weight, price, total;
	
	public RedApple(String name, String colour, String country, double price) {
		super(name, colour);
		this.price = price;
		this.country = country;
		
		System.out.println("\nEnter how many kg of Red Apple you want to buy");
		this.weight = s.nextDouble();
	}
	public double total() {
		return this.total = this.weight*this.price;
	}

}
