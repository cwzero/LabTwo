package com.liquidforte.java;

/**
 * Lab Two - display squares and cubes of numbers in a table
 * @version 1.0.0 September 3, 2015
 * @author Eric
 */
public class LabTwo {
	/**
	 * Main method - entry point for the class
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Number		Square		Cube");
		for (int value = 0; value <= 10; value++) {
			System.out.printf("%d\t\t%d\t\t%d\n", value, square(value), cube(value));
		}
	}
	
	/**
	 * Square method - squares a number
	 * @param value		value to be squared
	 * @return square of the  value
	 */
	private static int square(int value) {
		return value * value;
	}
	
	/**
	 * Cube method - cubes a number
	 * @param value		the number to be cubed
	 * @return the cubed value
	 */
	private static int cube(int value) {
		return value * square(value);
	}
}
