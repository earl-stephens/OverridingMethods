package application;

public class App {

	public static void main(String[] args) {
		HouseCat cat1 = new HouseCat();
		cat1.vocalize();
		cat1.hunt();
		
		Tiger cat2 = new Tiger();
		cat2.vocalize();
		cat2.hunt();
		
		Lion cat3 = new Lion();
		cat3.vocalize();
		cat3.hunt();
		
		//can also have:
		Cat cat4 = new HouseCat();
		cat4.vocalize();
		cat4.hunt();
		/* A variable of type Cat can refer to any of the 
		 * subclasses.  This is subtype polymorphism.
		 */
		Cat[] cats = {new HouseCat(), new Tiger(), new Lion()};
		
		for(Cat cat: cats) {
			cat.vocalize();
			cat.hunt();
		}

	}

}
