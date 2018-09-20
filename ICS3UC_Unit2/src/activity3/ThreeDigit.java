package activity3;

import simpleIO.Console;

public class ThreeDigit {

	public static void main(String[] args) {
		
		int input = Console.readInt("Enter the a number:");
		
		int num1 = (input-(input%100))/100;
		int num2 = ((input%100)-(input%10))/10;
		int num3 = (input%10);
		int sum=num1+num2+num3;
		Console.print("The sum of your numbers is: "+sum);
	}
}
