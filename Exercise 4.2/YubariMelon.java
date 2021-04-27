import java.util.Scanner;
public class YubariMelon extends Fruit {//subclass of Fruit
	Scanner s = new Scanner(System.in);
	String colour, country, taste;
	double weight, price, total;
	int quantity;
	
	public YubariMelon(String name, String colour, String taste, String country, double weight, double price) {
		super(name);
		this.colour = colour;
		this.taste = taste;
		this.country = country;
		this.weight = weight;
		this.price = price;
		
		System.out.println("\nHow many quantity of Yubari Melon you want to buy?");
		this.quantity = s.nextInt();
		
		
		
		
	}
	public double total() {
		return this.total = this.quantity*this.price;
		
		
	}
	
}
