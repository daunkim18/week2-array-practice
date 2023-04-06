package com.skillstorm.training.day4;

public class LoopPractice {

	public static void main(String[] args) {
		dash();
		System.out.println(String.format("%35s", "Example 1"));
		dash();

	

// print out the counter each time in your loop
	int count = 0;
	while (count < 5 ) {
		System.out.println(count++); // pritns 12345 instead of 01234
		//System.out.println(++count);
	}
	
	dash();
	System.out.println(String.format("%35s", "Example 1"));
	dash();
	
	} //main ends here
	public static void printArray(int[] numbers) {
		//setup
		//int index = 0;
		//condition
	//	while (index)
		//update
	}
	public static void printArray(String[] words) {
		
	}
	// TODO rewrite the dash() method to use a loop
	public static void dash() {
		System.out.println();
		// set up
		int count = 0;
		// loop condition
		while (count <68) {
			System.out.println("-");
		// update
			count++;
		}
	System.out.println("\n-------------------\n");
		System.out.println();
		System.out.println();
		
		int[] intArray = {2,5,46,12,34};
		

		System.out.println(intArray);
	}
}
