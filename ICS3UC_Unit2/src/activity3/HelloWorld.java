package activity3;

import simpleIO.Console;

public class HelloWorld {

	public static void main(String[] args) {
		String name;
		name = Console.readString("Enter your name: ");
		Console.print("Hello "+name+", how is your day?");

	}

}
