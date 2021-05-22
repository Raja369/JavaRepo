package com.stackroute.basics;

import java.util.Scanner;

public class StringFinder {
	// Create Scanner object as instance variable
	static Scanner scan = null;

	public static void main(String[] args) {
		// Get three strings from the user
		StringFinder.displayResult();
	}

	public static String getInput() {
		scan = new Scanner(System.in);
		String intialValue = scan.nextLine();
		String firstValue = scan.nextLine();
		String secondValue = scan.nextLine();
		int result = findString(intialValue, firstValue, secondValue);
		scan.reset();
		if (result == 1) {
			return "Found as expected";
		} else if (result == 0) {
			return "Not Found";
		} else {
			return "Empty string or null";
		}
	}

	public static void displayResult() {
		// displays the result
		String result = getInput();
		System.out.println(result);
	}

	public static int findString(String searchString, String firstString, String secondString) {
		int result = 0;
		if (searchString == null || firstString == null || secondString == null) {
			result = -1;
		} else if (searchString.equals("") || firstString.equals("") || secondString.equals("")) {
			result = -1;
		} else {
			String[] str = searchString.split(" ");
			if (str.length == 2) {
				if (str[0].contains(firstString) && str[1].contains(secondString)) {
					result = 1;
				} else {
					result = 0;
				}
			} else if (str.length == 3) {
				if (str[0].contains(firstString) && str[2].contains(secondString)) {
					return 1;
				} else {
					result = 0;
				}
			}
		}
		return result;
	}

	public void closeScanner() {
		scan.close();
	}
}