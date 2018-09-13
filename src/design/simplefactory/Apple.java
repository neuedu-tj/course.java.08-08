package design.simplefactory;

public class Apple extends Fruit{

	@Override
	public void grow() {
		System.out.println("Apple is growing .... ");
	}

	@Override
	public void harvest() {
		System.out.println("Apple has been harvested. ");
	}

	@Override
	public void plant() {
		System.out.println("Apple has been planted . ");
		
	}

}
