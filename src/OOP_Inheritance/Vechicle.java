package OOP_Inheritance;

public class Vechicle extends Automobile {

	public void engine() {
		System.out.println("Vehicle -- engine");
	}

	@Override
	public void aeroDynamic() {
		System.out.println("Vehicle -- aeroDynamic");
	}

}