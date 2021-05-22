package com.stackroute.basics;

import java.util.Scanner;

public class Calculator {
	private static Scanner scan;

	// define,declare scanner and call getValues with scanner as parameter
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		new Calculator().getValues(scan);
	}

	// Get values and which operator from the menu
	public void getValues(Scanner scan) {
		String choice = null;
		String result = null;
		do {
			int operand1 = scan.nextInt();
			int operand2 = scan.nextInt();
			int operator = scan.nextInt();
			scan.reset();
			result = calculate(operand1, operand2, operator);
			choice = scan.next();	
			scan.reset();
		}while(choice.equalsIgnoreCase("y"));
		System.out.println(result);
	}

	// perform operation based on the chosen switch case corresponding to the menu
	// and return string
	
	public static String calculate(int firstValue, int secondValue, int operator) {
        String result = null;
		switch(operator) {
        	case 1:
        		result = firstValue + " + " + secondValue + " = " + (firstValue + secondValue);
        		break;
        	case 2:
        		result = firstValue + " - " + secondValue + " = " + (firstValue - secondValue);
        		break;
        	case 3:
        		result = firstValue + " * " + secondValue + " = " + (firstValue * secondValue);
        		break;
        	case 4:
        		if(secondValue == 0) {
        			result =  "The divider (secondValue) cannot be zero";
        		}else {
        		result = firstValue + " / " + secondValue + " = " + (firstValue / secondValue);
        		}
        		break;
        	default:
        		result = "Entered wrong option " + operator;
        }
		return result;
    }
}