package activity2;

import simpleIO.Console;

public class CircleCircumference {
	
	public static void main(String[] args) {
		
		//takes input
		double radius = Console.readDouble("Enter the radius:");
		//finds the circumference
		double Circumference=(2*radius)*Math.PI; 
		
		Console.print("Your circumference is: "+ Circumference);
		
	}
}
