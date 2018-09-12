package activity3;

import simpleIO.Console;

public class RectanglePerimeter {
	
	public static void main(String[] args) {
		//gets input
		int width = Console.readInt("Enter the width: ");
		int length = Console.readInt("Enter the length: ");
		//calculates the perimeter
		int perimeter;
		perimeter = (width*2)+(length*2);
		Console.print("Your perimeter is: "+perimeter);	
	}
}