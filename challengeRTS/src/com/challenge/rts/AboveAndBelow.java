package com.challenge.rts;

/**
 * AboveAndBelow class prints the number of integers in an array that are above
 * the given input and the number that are below, e.g. for the array [1, 5, 2, 1, 10] 
 * with input 6, print “above: 1, below: 4”.
 * @author farha
 * @version 1.0
 */
public class AboveAndBelow {

	/**
	 * It prints the number of integers in an array that are above
	 * the given input and the number that are below
	 * @param array
	 * @param number
	 */
	public void printAboveAndBelow(int[] array, int number) {
		int above = 0;
		int below = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > number) {
				above++;
			}
			else if(array[i] < number) {
				below++;
			}
		}
		System.out.println("above: "+above+", below: "+below);
	}
	
	/**
	 * Main method which prints the number of integers in an array that are above
	 * the given input and the number that are below it
	 * @param args
	 */
	public static void main(String[] args) {
		AboveAndBelow ab = new AboveAndBelow();
		int[] array = {1, 5, 2, 1, 10};
		int number = 6;
		ab.printAboveAndBelow(array, number);
		
		int[] array2 = {3, 8, 9, 0, 8, 20};
		number = 8;
		ab.printAboveAndBelow(array2, number);	
	}
}

