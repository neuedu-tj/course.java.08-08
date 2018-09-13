package design.simplefactory;

public class Grape extends Fruit {

	public void grow() {
		System.out.println("Grape is growing .... ");
	}

	@Override
	public void harvest() {
		System.out.println("Grape has been harvested. ");
	}

	@Override
	public void plant() {
		System.out.println("Grape has been planted . ");
		
	}

}
