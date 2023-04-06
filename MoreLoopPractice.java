package com.skillstorm.training.day4;

import java.util.Arrays;

public class MoreLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
	//	while (true) causes an infinite loop and any code below will be unreachable
		while (x == 1) {
			System.out.println("Hello");
			x++;
		}
		// print out 321
		int count = 3;
		while (count > 0) {
			System.out.println(count);
			count--;

		}
		//letter in string one on each line
		String str = "Go Team!";
		int index = 0;
		while (index < str.length()) {
			char c = str.charAt(index);
			System.out.println(c);
			index++;
		}
		
		String strBackwards = "Go Team!";
		index = strBackwards.length() - 1;
		while (index >= 0) {
			char b = strBackwards.charAt(index);
			System.out.println(b);
			index--;
		}
		//a sentence one word per line
				String[] words = "It's a good day".split(" ");
				index = 0;
				while (index < words.length) {
				System.out.println(words[index]);
				index++;
				
			//	words = "It's thursday.".split("h");
			//	System.out.println(Arrays.toString(words));
			
				}
				
				int number = 1;
				int sum = 0;
				while (number <= 10) {
					sum = sum + 1; Math.max(sum, number)
					System.out.println("sum is now " + sum);
					number++;
				}
		System.out.println("End of main method");
	}

}
