package activity3;

import simpleIO.Console;

public class ThreeDigit {

	public static void main(String[] args) {
		
		int input = Console.readInt("Enter the a number:");
		
		int num1 = ((input%1000)-(input%100))/100;
		int num2 = ((input%100)-(input%10))/10;
		int num3 = (input%10);//-input;
		//double num1=input%10;
		//double num2=((input%100)%10);//-num1;
		//double num3=((input%1000)%100);
		
		int sum=num1+num2+num3;//+num2;//+num3;
		
		
		Console.print("The sum of your numbers is: "+sum);
	}
}
