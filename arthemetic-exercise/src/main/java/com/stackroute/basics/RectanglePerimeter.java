package com.stackroute.basics;
import java.util.*;
public class RectanglePerimeter {
    public static void main(String[] args) {
        new RectanglePerimeter().getValues();
    }
    //get user input from console
    public void getValues() {
    	Scanner input = new Scanner (System.in);
    	double length = input.nextDouble();
    	
    	double breadth = input.nextDouble();
    	input.close();
    	double result = perimeterCalculator(length,breadth);
    	System.out.println(result);
    }
    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {
    	double result = 2*(length+breadth);
        return result;
    }
    public int perimeterCalculator(int length, int breadth) {
    	int result = 2*(length+breadth);
        return result;
    }
    public float perimeterCalculator(float length, float breadth) {
    	float result = 2*(length+breadth);
        return result;
    }
}