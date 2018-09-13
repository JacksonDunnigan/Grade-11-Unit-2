package activity4;
import simpleIO.Console;

public class Stages {
	
	public static void main(String[] args) {
		
		//input
		int age = Console.readInt("Enter your age:");
		
		//logic
		if (age>18){
			Console.print("You're an Adult");
		} else if (age>13) {
			Console.print("You're a Teenager");
		} else if (age>11) {
			Console.print("You're a Preeteen");
		} else if (age>5) {
			Console.print("You're a Child");
		} else {
			Console.print("You're a Toddler");
		}
		
		
	}
}
