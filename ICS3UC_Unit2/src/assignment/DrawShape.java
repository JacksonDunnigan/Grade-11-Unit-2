package assignment;

import simpleIO.Console;

public class DrawShape {

    public static void main(String[] args) {
    	
    	boolean done=false;
    	
    	//loops until the person stops it
	    while (done==false)
	    {
	    	//gets input
	    	int shape_type = Console.readInt("What shape will you  like to draw?: \n1) Rectangle\n2) Triangle\n3) Diamond\n4) Hexagon\nEnter an input:");
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
	    			int triangle_type=Console.readInt("Enter the triangle type:\n1) Right\n2) Equilateral\n");
	    			Console.print("--------------------");
			    	
	    			//height=Console.readInt("Enter the triangle height: ");
			    	
			    	//choosing the triangle type
			    	switch(triangle_type) {
			    	
			    		//makes a right angle triangle
			    	
			    		case 1:
			    			width=Console.readInt("Enter the triangle width: ");
			    			String orientation=Console.readString("Enter the orientation. Left, Right: ");
			    			
			    			if (orientation.equals("left")) {
						     	//makes the shape
					    		for (int x = 0; x < width; x++) {
					    			shape+=dot;
					    			Console.print(shape);
					    		}
			    			}
			    			else if (orientation.equals("right")) {
				    			for (int y = 1; y <= width; y++) {
				    				
				    				for (int x = 1; x <= width; x++) {
				    					
				    					if (x>width/2-y && x+y>width){
						    				shape+=dot;
						    			}
				    					else {
				    						shape+="  ";
				    					}
						    		}
				    				shape+="\n";
		
				    			}
			        			
				    			Console.print(shape);
			    			}
			    			else {
			    				break;
			    			}
				    		
				        	break;
				        
				        //makes an equilateral triangle
				        
			    		case 2:
			    			int size=Console.readInt("Enter the triangle size: ");
			    			
					     	//makes the shape
			    			for (int y = 1; y <= size; y++) {
			    				
			    				for (int x = 1; x <= size; x++) {
			    					
			    					if (x>size/2-y && x+y>size){
					    				shape+=dot;
					    			}
			    					else {
			    						shape+=" ";
			    					}
					    		}
			    				shape+="\n";
	
			    			}
		        			
			    			Console.print(shape);
				    		
				        	break;
				        	
				        	
				        	
				        default:
				        	Console.print("Enter a proper input");
				        	break;
			    	}
			    	break;
			    
			    //makes a diamond
	    		case 3:
	    			//input
	    			Console.print("--------------------");
	    			int size=Console.readInt("Enter the width:"); 
	    			if (size>0){
	    				Console.print("--------------------");
	    			
				     	//makes the top of the diamond
		    			for (int y = 1; y <= size; y++) {
		    				
		    				for (int x = 1; x <= size; x++) {
		    					
		    					if (x>size/2-y && x+y>size){
				    				shape+=dot;
				    			}
		    					else {
		    						shape+=" ";
		    					}
				    		}
		    				shape+="\n";
		    			}
		    			//makes the bottom of the diamond
		    			for (int y = size-1; y >= 1; y--) {
		    				
		    				for (int x = 1; x <= size; x++) {
		    					
		    					if (x>size/2-y && x+y>size){
				    				shape+=dot;
				    			}
		    					else {
		    						shape+=" ";
		    					}
				    		}
		    				shape+="\n";
		    			}
		    			
		    			Console.print(shape);
			    		
	    			}
	    			else {
	    				Console.print("Enter a proper input");
			        	break;
	    				
	    			}
	    			break;
			    	
			    //makes a hexagon
	    		case 4:
	    			//input
	    			Console.print("--------------------");
	    			int side_length=Console.readInt("Enter the length of each side:"); 
	    			if (side_length>0){
	    				Console.print("--------------------");
	    			
				     	//makes the top of the hexagon
		    			for (int y = 1; y <= side_length; y++) {
		    				
		    				for (int x = 1; x <= side_length; x++) {
		    					
		    					if (x>side_length/2-y && x+y>side_length){
				    				shape+=dot;
				    			}
		    					else {
		    						shape+=" ";
		    					}
				    		}
	    					
					    	//makes the center of the hexagon
				    		for (int xx = 0; xx < side_length; xx++) {
				    			shape+=dot;
				    		}
				
		    				shape+="\n";
		    			}
		    			

		    			//makes the bottom of the hexagon
		    			for (int y = side_length-1; y >= 1; y--) {
		    				
		    				for (int x = 1; x <= side_length; x++) {
		    					
		    					if (x>side_length/2-y && x+y>side_length){
				    				shape+=dot;
				    			}
		    					else {
		    						shape+=" ";
		    					}
				    		}
	    					
					    	//makes the center of the hexagon
				    		for (int xx = 0; xx < side_length; xx++) {
				    			shape+=dot;
				    		}
		    				shape+="\n";
		    			}
		    			
		    			Console.print(shape);
			    		
	    			}
	    			else {
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
	    	Console.print("--------------------");
	    	//loops the program
	    	String stop=Console.readString("Do you want to keep making shapes? Yes, No");
	    	if (stop.equals("yes")){
	    		done = false;
	    	}
	    	else {
	    		done = true;
	    	}
	    	Console.print("--------------------");
	    }
    }
}
