
public class Apple extends Fruit {
	String colour;
	
	public Apple(String name, String colour) {
		super(name);
		this.colour = colour;
		System.out.println("Apple constructor is invoked");
	}

}
