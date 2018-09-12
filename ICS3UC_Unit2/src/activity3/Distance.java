package activity3;
import simpleIO.Console;

public class Distance {
	
	public static void main(String[] args) {
		double distance = 0;
		//calculates the distance
		for (int i = 0; i<3; i++)
		{
			distance+=Console.readInt("Enter the race distance:");
		}
		//prints the race distance
		Console.print("The race is: "+ distance + "km");
		
	}
}
