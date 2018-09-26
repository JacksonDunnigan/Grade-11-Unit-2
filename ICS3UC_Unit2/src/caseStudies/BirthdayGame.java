package caseStudies;

import simpleIO.Console;

public class BirthdayGame {

    public static void main(String[] args) {

        //Variables
        int playerNum;
        int birthMonth, birthDay;

        //Directions for the user
        Console.print("Let's play the birthday game! Follow these instructions carefully:\n");
        Console.print("1. Determine your birth month (January=1, February=2 and so on).");
        Console.print("2. Multiply that number by 5.");
        Console.print("3. Add 6 to that number.");
        Console.print("4. Multiply the number by 4.");
        Console.print("5. Add 9 to the number.");
        Console.print("6. Multiply that number by 5.");
        Console.print("7. Add your birth day to the number (10 if the 10th and so on).\n");
        
        //Input
        playerNum = Console.readInt("Enter your number: ");
        
        //Processing
        playerNum -= 165;
        birthMonth = playerNum / 100;
        birthDay = playerNum % 100;
        
        //Output
        Console.print("Your birthday is " + birthMonth + "/" + birthDay);

    }

}