package assignment;

import simpleIO.Console;

public class FastFood {

	public static void main(String[] args) {
		
		// constant for tax
		final double TAX = 0.13;
		
		// input
		int burgers = Console.readInt("Enter the number of burgers ($1.69 each): ");
		int fries = Console.readInt("Enter the number of fries ($1.09 each): ");
		int sodas = Console.readInt("Enter the number of sodas ($0.99 each): ");
		Console.print("-------------------");
		
		//total before tax
		double total = (burgers*1.69)+(fries*1.09)+(sodas*0.99);
		Console.print("Total before tax: $"+Console.roundDouble(total,2));
		
		// tax
		double tax = total*TAX;
		Console.print("Tax: $"+Console.roundDouble(tax,2));
		
		// total after tax
		total+=tax;
		Console.print("Total after tax: $"+Console.roundDouble(total,2));
		
		// paying
		double payment=Console.readDouble("Enter amount tendered: ");
		double change=payment-total;
		
		// output
		if (change<0) {
			Console.print("You are $"+Console.roundDouble(change*-1,2)+" short.\nleave the store cheapskate");
		} else {
			
			
			//prints change
			Console.print("-------------------");
			Console.print("Your change: $"+Console.roundDouble(change,2));
			
			//calculates coins
			double toonies = ((change-change%2)/2);
			change-= toonies*2;
					
			double loonies = (change-change%1);
			change-= loonies;
			
			double quarters = ((change-change%0.25)/0.25);
			change-= quarters*0.25;
			
			double dimes = (change-change%0.1)/0.1;
			change-=dimes*0.1;
			
			double nickels = (change-change%0.05)/0.05;
			change-=nickels*0.05;
			
			
			//output
			Console.print("-------------------");
			Console.print("Toonies: " +Math.round(toonies));
			Console.print("Loonies: "+Math.round(loonies));
			Console.print("Quarters: "+Math.round(quarters));
			Console.print("Dimes: "+Math.round(dimes));
			Console.print("Nickels: "+Math.round(nickels));
			Console.print("-------------------");
		}
	}
}
