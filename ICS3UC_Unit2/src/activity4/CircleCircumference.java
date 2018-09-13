package activity4;

import simpleIO.Console;

public class CircleCircumference {
	
	public static void main(String[] args) {
		
		double radius = 0;
		while(radius<=0)
		{
			//takes input
			radius = Console.readDouble("Enter the radius:");
			
			//checks if the proper radius is entered
			if (radius>0) {
				//finds the circumference
				double Circumference=(2*radius)*Math.PI; 
				Console.print("The circumference of your circle is: "+ Circumference);
				break;
			}
			//prints the message if the raius os less than 0
			Console.print("Negative radii are illegal");
		}
	}
}
