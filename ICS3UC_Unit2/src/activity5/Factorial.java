package activity5;

import simpleIO.Console;

public class Factorial {
	
	public static void main(String[] args) {
		
		//input
		int number = Console.readInt("Enter a number:");
		int output = number;
		
		//logic
		for (int i=number-1; i>0; i--) {
			output*=i;
		}
		//output
		Console.print(number+" factorial is "+output);
		
	}
}