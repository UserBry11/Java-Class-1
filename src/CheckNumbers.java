import java.util.Scanner;


public class CheckNumbers{
	public static void main(String[] args) {
		try {
			readString();
		} catch (NoVowelException e) {
			System.err.println("Message: " + e.getMessage());
		}
		
	}
	
	s
	public static void readString() throws NoVowelException{
		String text = "";
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a string\n");
		text = scanner.nextLine();
		int count = 0;
		boolean flag = false;
		
		String vowels = "aeiouAEIOU";
		
		for(int index = 0; index < text.length(); index++) {
			char letter = text.charAt(index);
			if(vowels.contains(String.valueOf(letter))) {
				flag = true;
				break;
			}
		}
		if(!flag) throw new NoVowelException("No vowels here");

//		
//
//	    for (int i = 0; i < text.length(); i++) {
//	      char ch = text.charAt(i);
//	      if (vowels.contains(String.valueOf(ch))) {
//	        flag = true;
//	        break;
//	      }
//	    }
//	    if (!flag) {
//	      throw new NoVowelException("String does not contain any vowels.");
//	    }
//		
//		
//		
//		if(inputString != "") {
//			for(char letter : inputString.toLowerCase().toCharArray()) {
//				if (letter == 'a' || letter == 'e' || letter == 'i'|| letter == 'o' || letter == 'u') {
//					count++;
//				}
//			}
//		}
//		if(count == 0) throw new NoVowelException("No vowels were inputtd.");
//		
	}

}

class NoVowelException extends Exception{
	public NoVowelException(String message) {
		super(message);
	}
}