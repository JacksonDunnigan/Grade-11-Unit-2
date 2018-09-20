package activity5;

import simpleIO.Console;

public class NumbersSum {

	public static void main(String[] args) {
		// input
		int input = Console.readInt("Enter a number:");
		int sum = 0;
		// output
		for (int i = 0; i < input + 1; i++) {
			sum += i;
			Console.print(i);
		}
		// outputs the sum
		Console.print(sum);
	}
}
