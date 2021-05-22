package com.stackroute.basics;
import java.util.Scanner;
public class PhoneNumberValidator {
    //Create Scanner object as instance variable
    public static void main(String[] args) {	
        //call the functions in the required sequence
    	displayResult(validatePhoneNumber(getInput()));
    }
    public static String getInput() {
    	Scanner input = new Scanner(System.in);
    	String result = input.nextLine();
    	input.close();
        return result;
    }
    public static void displayResult(int result) {
        if(result == 1) {
        	System.out.println("Valid");
        }
        else if(result == 0){
        	System.out.println("Invalid");
        }else {
        	System.out.println("Empty string");
        }
    }
    public static int validatePhoneNumber(String input) {
    	 String str = input;
    	 int count= 0;
    	 if(input == null) {
      		return -1;
      	}
    	 if(input.contains("#")) {
    		 return 0;
    	 }
    	 if(input.contains("u")) {
    		 return 0;
    	 }
    	 if(input.equals("")) {
     		return -1;
     	}
         for(int i=0; i < str.length(); i++) {
            Boolean flag = Character.isDigit(str.charAt(i));
            if(flag) {
            count ++;
            }
         }
    	if(count == 10) {
    		return 1;
    	}
    return 0;
    }
    public void closeScanner(){
        //close the Scanner object
    	Scanner in = new Scanner(System.in);
    	in.close();
    }
}