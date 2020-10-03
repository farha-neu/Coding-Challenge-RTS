package com.challenge.rts;

/**
 * RotateInput class rotates the characters in a string by a given input and
 * have the overflow appear at the beginning e.g. "MyString" rotated by 2 is "ngMyStri"
 * @author farha
 * @version 1.0
 */
public class RotateInput {

	/**
	 * It rotates the characters in a string by a given input and returns the rotated string
	 * where the overflow appear at the beginning e.g. "MyString" rotated by 2 is "ngMyStri"
	 * @param input
	 * @param rotateBy
	 * @exception StringIndexOutOfBoundsException if rotateBy is less than 0 or greater than the string length
	 * @return rotated string
	 */
	public String findRotatedString(String input, int rotateBy) {
		if(rotateBy < 0) {
			throw new StringIndexOutOfBoundsException("Invalid input: Number of characters to be rotated by is less than 0");
		}
		else if(rotateBy > input.length()) {
			throw new StringIndexOutOfBoundsException("Invalid input: Number of characters to be rotated by is greater than string length");
		}
		else if(input.isBlank()) {
			return input;
		}
		else {
			int overflowStartIndex = input.length()-rotateBy;
			String newStr = input.substring(overflowStartIndex) + input.substring(0, overflowStartIndex); 
			return newStr;
		}
	}
	
	/**
	 * Main method which prints the rotated string for a given input
	 * @param args
	 */
	public static void main(String[] args) {
		RotateInput rotateInput = new RotateInput();
		String input = "MyString";
		int rotateBy = 2;
		System.out.println(rotateInput.findRotatedString(input, rotateBy));
		
		input = "Hello";
		rotateBy = 4;
		System.out.println(rotateInput.findRotatedString(input, rotateBy));
		
		input = "  ";
		rotateBy = 1;
		System.out.println(rotateInput.findRotatedString(input, rotateBy));		
	}
}
