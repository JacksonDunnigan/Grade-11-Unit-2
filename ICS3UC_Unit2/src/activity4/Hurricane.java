package activity4;

import simpleIO.Console;

public class Hurricane {

	public static void main(String[] args) {
		//input
		int category =Console.readInt("Enter the hurricane category :");
		
		//logic
		switch(category ) {
			case 1:
				Console.print("The average wind speeds range from 119-153 km/h");
				break;
			case 2:
				Console.print("The average wind speeds range from 154-177 km/h");
				break;
			case 3:
				Console.print("The average wind speeds range from 178-208 km/h");
				break;
			case 4:
				Console.print("The average wind speeds range from 209-251 km/h");
				break;
			case 5:
				Console.print("The average wind speeds are 252 km/h or higher");
				break;
			default:
				Console.print("Enter a valid number");
				break;
			
		} 
		
	}
}