//Like abstract classes, interfaces cannot be used to create objects.
/*
 * It is not possible to create an 	"Animal" object in the Interface this file.
 * Interface methods do not have a body - the body is provided by the "implement" class.
 * On implementation of an interface, you must override all of its methods.
 * Interface methods are by default abstract and public.
 * Interface attributes are by default public, static and final.
 * public - anyone can use it.
 * static - no object creation needed, it belongs to the interface itself.
 * final - the value can't be changed, it's a fixed constant.
 * Why? Because interfaces are designed to define constants and contracts (methods).
 * An interface cannot contain an constructor (as it cannot be used to create an object).
 * Interface or a contract with its methods and constants.
 */
interface Animal {
	public void animalSound();
	public void sleep();
}

interface Animal2{
	public void myOtherMethod();
	
}

class Pig implements Animal, Animal2 {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
	
	public void sleep() {
		System.out.println("Zzz");
	}
	
	public void myOtherMethod() {
		System.out.println("The Pig class has created its own version of the abstract rule/method 'myOtherMethod'");
	}
}



public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig pig = new Pig();
		pig.animalSound();
		pig.sleep();
		
		pig.myOtherMethod();
	}

}
