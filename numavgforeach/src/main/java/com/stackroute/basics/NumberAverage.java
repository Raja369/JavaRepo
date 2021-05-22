package com.stackroute.basics;
import java.util.Scanner;
public class NumberAverage {
	public static void main(String[] args) {
		new NumberAverage().getArrayValues();
	}
	// get the values of the array from the user
	public void getArrayValues() {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int inArray[] = new int[size];
		scan.reset();
		for (int index = 0; index < inArray.length; index++) {
				inArray[index] = scan.nextInt();
		  }
		scan.close();
		String result = findAverage(inArray);
		System.out.println(result);
	}

	// write here logic to calculate the average an array
	public String findAverage(int[] inputArray) {
		int totalSum = 0;
		String result = null;
		if (inputArray.length == 0) {
				result = "Empty array";
		}else {
		for (int values : inputArray) {
				if (values < 0) {
					return "Give proper positive integer values";
				} else {
					totalSum += values;
					int average = (totalSum / (inputArray.length));
					result = "The average value is: " + average;
				}
			}
		}
		return result;
	}
}