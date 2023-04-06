package com.skillstorm.training.day4;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3 };
		nums = new int[0];
		printArray(nums);
		printArray(null);
		
		printArrayBackwards(new int[] { 1, 2, 3 });
		printArrayBackwards(new int[] {});
		printArrayBackwards(null);
	}

	public static void printArray(int[] numbers) {
		if (numbers == null) {
			System.out.println("numers can't be null");
		} else {
			// setup
			int i = 0;
			// condition
			while (i < numbers.length) {
				System.out.println("numbers[" + i + "]=" + numbers[i]);
				// update
				i++;

			}
		}
	}

	public static void printArrayBackwards(int[] numbers) {
		// setup
		int i = numbers.length - 1;
		// condition
		while (i < numbers.length) {
			System.out.println("numbers[" + i + "]=" + numbers[i]);
			//update
			i--;
		}
	}
}

