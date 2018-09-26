package caseStudies;

import simpleIO.Console;

public class Science {

    public static void main(String[] args) {
        //Constants
    	int number=Console.readInt("Enter the atomic number of your element:");
    	int outer_shell;
    	
    	if (number>2) {
    		outer_shell=((number-2)%8);
    	} else {
    		outer_shell=number;
    	}
    	
    	Console.print("your electron has "+outer_shell+" electrons in its outer shell");
    	
    }
}
