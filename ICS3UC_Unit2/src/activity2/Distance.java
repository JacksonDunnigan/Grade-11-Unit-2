package activity2;
import simpleIO.Console;

public class Distance {
	
	public static void main(String[] args) {
		
		double first_segment = 12.2;
		double second_segment = 10.6;
		double third_segment = 5.8;
		double distance;
		distance = first_segment + second_segment + third_segment;
		
		Console.print("The race is: "+ distance + "km");
		
	}
}
