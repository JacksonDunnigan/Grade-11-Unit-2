package assignment;

import simpleIO.Console;

public class DrawShape {

    public static void main(String[] args) {
    	
    	int width=Console.readInt("Enter a rectangle width: ");
    	int height=Console.readInt("Enter a rectangle height: ");
    	String shape = "";
    			
    	for (int y = 0; y < height; y++) {
    		for (int x = 0; x < width; x++) {
    			shape+="* ";
    		}
        	shape+="\n";
        	
    	}
    	Console.print(shape);
    	

    }
    
}
