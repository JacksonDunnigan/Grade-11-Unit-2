package assignment;

import simpleIO.Console;

public class DrawShape {

    public static void main(String[] args) {
    	
    	//gets input
    	int shape_type = Console.readInt("What shape will you  like to draw?: \n1) Rectangle\n2) Triangle\n3) Circle\n");
    	String shape = "";
    	String dot = "* ";
    	int width = 0;
    	int height = 0;
    	
    	//decisions
    	switch(shape_type){
    	
    		//makes a rectangle
    		case 1:
    			
    			//gets dimensions
    			Console.print("--------------------");
		    	width=Console.readInt("Enter a rectangle width: ");
		    	height=Console.readInt("Enter a rectangle height: ");
		    
		    	//makes the shape
		    	for (int y = 0; y < height; y++) {
		    		for (int x = 0; x < width; x++) {
		    			shape+=dot;
		    		}
		        	shape+="\n";
		    	}
		    	Console.print("--------------------");
		    	Console.print(shape);
		    	break;
		    
		    //makes a triangle
    		case 2:
    			//input
    			Console.print("--------------------");
    			int triangle_type=Console.readInt("Enter the triangle type:\n1) Right\n2) Equalateral\n3) Isosceles\n"); 
    			Console.print("--------------------");
		    	
    			//height=Console.readInt("Enter the triangle height: ");
		    	
		    	//choosing the triangle type
		    	switch(triangle_type) {
		    	
		    		//makes a right angle triangle
		    	
		    		case 1:
		    			width=Console.readInt("Enter the triangle width: ");
				     	//makes the shape
			    		for (int x = 0; x < width; x++) {
			    			shape+="* ";
			    			Console.print(shape);
			    		}
			    		
			        	break;
			        
			        //makes an equilateral triangle
			        
		    		case 2:
		    			int size=Console.readInt("Enter the triangle size: ");
		    			
				     	//makes the shape
		    			for (int y = 0; y <= size; y++) {
		    				
		    				for (int x = 0; x <= size/2-x; x++) {
		    					
		    					if ((y+x)>size){
				    				shape+="* ";
				    			}
				    		

				
				    		}
		        			
			    			Console.print(shape);

		    			}
			    		
			    		
			        	break;
			        	
			        	
			        default:
			        	Console.print("Enter a proper input");
			        	break;
		    	}
		    	break;
		    	
		    	
		    //runs if the wrong input is entered
    		default:
    			Console.print("--------------------");
    			Console.print("Enter a proper choice");
    			break;
    			
    	}
    }
}
