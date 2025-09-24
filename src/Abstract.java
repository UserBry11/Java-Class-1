/*
 * Data abstraction is the process of hiding certain (sometimes complex) details and showing only essential information to the user.
 * Abstraction can be achieved with either abstract classes or interfaces.
 * The abstract keyword is a non-access modifier, used for classes and methods:
 * Abstract class is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
 * 
 * Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
 * An abstract class can have both abstract and regular methods.
 */

abstract class Animals {
	public abstract void animalSound();
	public void sleep() {
		System.out.println("Zzz");
	}
}

//To access the abstract class (since we cannot create an object from the blueprint) it must be inherited from another class we used.
//subclass
class Pigs extends Animals {
	public void animalSound() {
	    System.out.println("The pig says: wee wee");
	}
	
}

class Abstract {
	
	public static void main(String[] args) {
		Pigs pig = new Pigs();
		pig.animalSound();
		pig.sleep();
	}
}