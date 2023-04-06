package com.skillstorm.training.day4;

public class findMax {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] nums = { 1, 2, 2, 3 };
//		nums = new int[0];
//		printArray(nums);
//		printArray(null);
//		
//	}
//
//	public static void printArray(int[] nums) {
//		if (nums == null) {
//			System.out.println("numbers can't be null");
//		} else {
//			// setup
//			int i = 0;
//			// condition
//			while (i < nums.length) {
//				System.out.println("numbers[" + i + "]=" + nums[i]);
//				// update
//				i++;
//
//			}}}
	public static void main(String[] args) {
		
		int[] nums = {23, 101, 8, 25, 77, 5};
		int[] empty = {};
		int[] duplicate = {23, 101, 101, 25, 77, 5};
		int[] one = {23};
		findMax(null);
		int answer = findMax(nums);
		int answer1 = findMax(empty);
		int answer2 = findMax(duplicate);
		int answer3 = findMax(one);
			System.out.println(answer);
			System.out.println(answer1);
			System.out.println(answer2);
			System.out.println(answer3);
		
	//	System.out.println("Largest element present in given array: " + max);

	}
	public static int findMax(int[] nums) {
	if (nums == null || nums.length == 0) {
		System.out.println("It didnt work");
		return 0;
	}
		
	int i = 0;
	int max = nums[0];
	while(i < nums.length) {
	    if (nums[i] > max) {
	        max = nums[i];
	    }
	    i++;

	}
	return max;	
}
}
