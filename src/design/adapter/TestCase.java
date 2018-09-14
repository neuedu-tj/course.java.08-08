package design.adapter;

public class TestCase {
	
	public static void main(String[] args) {
		
		Adaptee a1 = new Adaptee110();
		Adaptee a2 = new Adaptee220();
		
		Target target = new Adapter( a2 );
		
		target.foo();
		target.development();
		
	}

}
