package activity5;

import simpleIO.Console;

public class TimesTable {
	
	public static void main(String[] args) {
		Console.print("Welcome to the Times Table program!\nThis program will output a times table using numbers you specify");
		//input
		int low_number=Console.readInt("Enter the low number:");
		int high_number=Console.readInt("Enter the high number:");
		String table = "X";
		
		//logic and math
		for (int y = 2; y<high_number+1;y++) {
			
			for (int x = 2; x<high_number+1;x++) {
				if (y>2) {
					table+="\t"+x*y;
				}
				else {
					table+="\t"+x;
				}
				
			}
			table+="\n"+y;
		}
	

		
			Console.print(table);
	}
}
