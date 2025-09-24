
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static int[] numArray = {1,35,4,2,0};
	public static int[] numArray2 = new int[5];
	
	public static int getLargest(int[] inputArray) {
		int largestNumber = 0;

		for(int index = 0; index < inputArray.length; index++) {
			if(largestNumber < inputArray[index]) {
				largestNumber = inputArray[index];
			}
		}
		return largestNumber;
	}
	public static int[] reverseArray(int[] inputArray) {
		int[] copyArray = inputArray.clone();
		int lastIndex = inputArray.length;

		for(int index = 0; index < inputArray.length; index++) {
			lastIndex--;
			copyArray[index] = inputArray[lastIndex];
		}
		return copyArray;
	}
	public static int secondLargestNumber(int[] inputArray) {
		int largestNumber = getLargest(inputArray);
		int secondLargest = 0;
		int[] copyArray = new int[inputArray.length];
		
		for(int index = 0; index < inputArray.length; index++) {
			
			if(inputArray[index] != largestNumber) {
				copyArray[index] = inputArray[index];
			}
			else copyArray[index] = 0;
		}
		secondLargest = getLargest(copyArray);
		return secondLargest;
	}
	
//	public static int[] sortArray() {
//		System.out.println("\nThis is 5");
//		Arrays.sort(numArray);
//		System.out.println(Arrays.toString(numArray));
//		return numArray;
//	}
	//[0,0,2,4,35]
	
	public static int[] removeDuplicates(int[] inputArray) {
		ArrayList<Integer> newArrayList = new ArrayList<>();
		
		for(int element: inputArray) {
			
			if(!newArrayList.contains(element)) newArrayList.add(element);
		}

		int[] newArray = new int[newArrayList.size()];

		for(int index = 0; index < newArrayList.size(); index++) {
			newArray[index] = newArrayList.get(index);
		}
		return newArray;
	}
	public static int searchInArray(int[] inputArray) {
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter an index between 0 - 4 to search for an element in this array");
		int index = scanObj.nextInt();
		
		System.out.println("This is the element in the array: " + inputArray[index]);
		return inputArray[index];
	}	
	
	public static void main(String[] args) {
		//1
		//Write a Java program to find the largest element in an array.
		
		System.out.println("1 -----------------------");
		int element = getLargest(numArray);
		System.out.println(Arrays.toString(numArray));
		System.out.println(element);
		
		//======================================
		//2
		//Write a Java program to reverse an array.
		System.out.println("\n2 -----------------------");
		int[] reversedArray = reverseArray(numArray);
		System.out.println(Arrays.toString(numArray));
		System.out.print(Arrays.toString(reversedArray));
		
		
		//=============================================
		//3
//		Write a Java program to find the second largest element in an array.
		System.out.println("\n3 -----------------------");
		System.out.print("2nd largest: " + secondLargestNumber(numArray));

		//4
		//Write a Java program to remove duplicates from an array.
		System.out.println("\n4 -----------------------");
		System.out.println(Arrays.toString(numArray));
		int[] duplicateArray = {0, 3, 32, 0, 1, 1};
		System.out.println(Arrays.toString(duplicateArray));
		System.out.println(Arrays.toString(removeDuplicates(duplicateArray)));

		//=============================================
		//5
		System.out.println("\n5 -----------------------");

		int[] sortedArray = new int[numArray.length];	
		System.out.println(Arrays.toString(numArray));

		sortedArray = numArray.clone();
		Arrays.sort(sortedArray);
		
		System.out.println(Arrays.toString(sortedArray));
		//6
		//Write a Java program to search for an element in an array.
		//
		System.out.println("\n6 -----------------------");
		searchInArray(numArray);
		System.out.println(Arrays.toString(numArray));

	}

}
