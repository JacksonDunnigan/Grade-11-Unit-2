package activity5;

import simpleIO.Console;

public class NumbersSum {
	
	public static void main(String[] args) {
		//input
		int input=Console.readInt("Enter a number:");
		
		//output
		for (int i=0; i<input+1; i++) {
			Console.print(i);
		}
	}
}
