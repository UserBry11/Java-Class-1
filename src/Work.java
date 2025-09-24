
public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Swap two numbers without using a third variable.
		int A = 3;
		int B = 4;
		
		A = A + B;
		B = A - B;
		A = A - B;
		System.out.println("Variable A: " + A);
		System.out.println("Variable B: " + B);

		

//		Reverse a string without using built-in functions.
		String word = "apple and bananas to eat.";
		char letter = 'a';
		String reverseString = "";
		
		for (int index = word.length() - 1; index >= 0; index--) {
			letter = word.charAt(index);
			
			reverseString = reverseString + letter;
		}
		System.out.println(reverseString);
	}

}
