package activity2;

import simpleIO.Console;

public class GradeAvg {
	
	public static void main(String[] args) {
		
		int average = 0;
		//takes 5 inputs
		
        for(int i=0; i<5; i++){
        	//gets input
        	average += Console.readInt("Enter a grade:");
        }
        
        //divides the grades by 5
        average/=5;
        
		//prints the grades
        Console.print("Your average grade is: "+average);

	}
}
