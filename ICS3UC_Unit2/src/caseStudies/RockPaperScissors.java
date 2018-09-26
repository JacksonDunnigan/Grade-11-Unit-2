package caseStudies;

import simpleIO.Console;

/**
 * This application simulates a simple rock-paper-scissors game with the computer
 * 
 * @author K. Spindler
 */

public class RockPaperScissors {

    public static void main(String[] args) {
        //Constants
        final int ROCK = 1, PAPER = 2, SCISSORS = 3;

        //Variables
        int playerThrow, computerThrow;

        //Input - obtain choice from user
        Console.print("Welcome to Rock-Paper-Scissors!");
        playerThrow = Console.readInt("Make your choice: " + ROCK + "-rock; " + PAPER + "-paper; " + SCISSORS + "-scissors");

        //echo back their choice
        Console.print("Player chose: ", false);
        switch (playerThrow) {
            case ROCK: Console.print("ROCK."); break;
            case PAPER: Console.print("PAPER."); break;
            case SCISSORS: Console.print("SCISSORS."); break;
        }

        //Simulate a choice from the computer
        computerThrow = (int)(3 * Math.random() + 1); /* random int between 1 and 3 */
        Console.print("The computer chose: ", false);
        switch (computerThrow) {
            case ROCK: Console.print("ROCK."); break;
            case PAPER: Console.print("PAPER."); break;
            case SCISSORS: Console.print("SCISSORS."); break;
        }

        //Processing and Output
        if (playerThrow == ROCK) {
            if (computerThrow == ROCK)
                Console.print("It's a draw!");
            else if (computerThrow == PAPER)
                Console.print("Computer wins!");
            else if (computerThrow == SCISSORS)
                Console.print("Player wins!");

        } else if (playerThrow == PAPER) {
            if (computerThrow == ROCK)
                Console.print("Player wins!");
            else if (computerThrow == PAPER)
                Console.print("It's a draw!");
            else if (computerThrow == SCISSORS)
                Console.print("Computer wins!");

        } else if (playerThrow == SCISSORS) {
            if (computerThrow == ROCK)
                Console.print("Computer wins!");
            else if (computerThrow == PAPER)
                Console.print("Player wins!");
            else if (computerThrow == SCISSORS)
                Console.print("It's a draw!");
        }

        Console.print("Thank you for playing Rock-Paper-Scissors!");
    }
}