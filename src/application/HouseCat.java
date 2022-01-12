package application;

public class HouseCat extends Cat {
	
	//Override the super class method using the same
	//method signature, but with different code block
	
	@Override
	public void vocalize() {
		System.out.println("Meow!");
	}
	//@Override is an annotation.  In this case it double
	//checks that the method signature is the same as that in 
	//the super class. and will give an error if it isn't
	//Best practice kind of thing
	
}
