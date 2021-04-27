import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double totalprice, paid, change;
		
		Apple a = new Apple("Apple", "Green & Red");
		System.out.println("Fruit : " + a.name);
		System.out.println("Colour : " + a.colour);
		
		GreenApple b = new GreenApple("Green Apple", "Green","Australia", 10);
		
		System.out.println("Name : " + b.name);
		System.out.println("Colour : " + b.colour);
		System.out.println("Country : " + b.country);
		System.out.printf("Weight : %.2fkg",b.weight);
		System.out.printf("\nPrice : RM%.2f",b.price);
		System.out.printf("\nTotal : RM%.2f",b.total());
		
		RedApple c = new RedApple("Red Apple", "Red", "United States", 20);
		
		System.out.println("Name : " + c.name);
		System.out.println("Colour : " + c.colour);
		System.out.println("Country : " + c.country);
		System.out.printf("Weight : %.2fkg",c.weight);
		System.out.printf("\nPrice : RM%.2f",c.price);
		System.out.printf("\nTotal : RM%.2f",c.total());
	
		YubariMelon d = new YubariMelon("Yubari Melon", "Yellow-Green", "Sweet", "Hokkaido, Japan", 1.6, 800);
		
		System.out.println("Name : " + d.name);
		System.out.println("Colour : " + d.colour);
		System.out.println("Taste : " + d.taste);
		System.out.println("Country : " + d.country);
		System.out.printf("Weight : %.2fkg",d.weight);
		System.out.printf("\nPrice : RM%.2f",d.price);
		System.out.printf("\nTotal : RM%.2f",d.total());
		
		Durian e = new Durian("Durian Musang King", "Yellow", "Sweet", "Pahang, Malaysia", 4, 360);
		
		System.out.println("Name : " + e.name);
		System.out.println("Colour : " + e.colour);
		System.out.println("Taste : " + e.taste);
		System.out.println("Country : " + e.country);
		System.out.printf("Weight : %.2fkg",e.weight);
		System.out.printf("\nPrice : RM%.2f",e.price);
		System.out.printf("\nTotal : RM%.2f",e.total());
		
		
		totalprice = b.total()+c.total()+d.total()+e.total();
		System.out.printf("\nTotal price : RM%.2f",totalprice);
		System.out.printf("\nEnter your payment : RM");
		paid = s.nextDouble();
		System.out.printf("Paid : RM%.2f",paid);
			
		change = paid-totalprice;
		System.out.printf("\nYour change : RM%.2f",change);
		
		
		System.out.println("\n==========RECEIPT==========");
		System.out.printf("Total \t: RM%.2f",totalprice);
		System.out.printf("\nPaid \t: RM%.2f",paid);
		System.out.printf("\nChange \t: RM%.2f",change);
		System.out.println("\n==========THANK YOU==========");
	}
	

}
