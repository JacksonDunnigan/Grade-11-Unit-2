package activity3;

import simpleIO.Console;

public class ThreeDigit {

	public static void main(String[] args) {
		
		double sum = 0;
		for (int i = 0; i<3; i++)
		{
			sum+=Console.readInt("Enter the a number:");
		}
		
		Console.print("The sum of your numbers is: "+sum);
	}
}
