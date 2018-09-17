package activity5;

import simpleIO.Console;

public class TimesTable {
	
	public static void main(String[] args) {
		Console.print("Welcome to the Times Table program!\nThis program will output a times table using numbers you specify");
		//input
		int low_number=Console.readInt("Enter the low number:");
		int high_number=Console.readInt("Enter the high number:");
		String table = " ";
		
		//logic and math
		for (int y = low_number-1; y<high_number+1;y++) {
			table+="\n"+y;
			
			for (int x = low_number; x<high_number+1;x++) {
				
				if (y==low_number-1) {
					table+="\t"+x;
				}

				else {
					table+="\t"+x*y;
				}
			}  
		}
		
		Console.print(table);
	}
}
