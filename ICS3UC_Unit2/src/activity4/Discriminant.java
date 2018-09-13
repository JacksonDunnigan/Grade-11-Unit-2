package activity4;
import simpleIO.Console;

public class Discriminant {
	
	public static void main(String[] args) {
		
		//takes input
		double a = Console.readDouble("Enter the value for a:");
		double b = Console.readDouble("Enter the value for b:");
		double c = Console.readDouble("Enter the value for c:");
		
		//calculates the discriminant
		double discriminant=(Math.pow(b, 2))-(4*a*c);
		
		//logic and output
		if (discriminant<0) {
			Console.print("No root");
		} else if (discriminant==0) {
			Console.print("One root");
		} else {
			Console.print("Two roots");
		}
	}
}
