package assignment;

import simpleIO.Console;

public class FastFood {

	public static void main(String[] args) {
		
		// constant for tax
		final double TAX = 0.13;
		
		// input
		int burgers = Console.readInt("Enter the number of burgers: ");
		int fries = Console.readInt("Enter the number of fries: ");
		int sodas = Console.readInt("Enter the number of sodas: ");
		
		//total before tax
		double total = (burgers*1.69)+(fries*1.09)+(sodas*0.99);
		Console.print("Total before tax: "+Console.roundDouble(total,2)+"$");
		
		// tax
		double tax = total*TAX;
		Console.print("Tax: "+Console.roundDouble(tax,2)+"$");
		
		// total after tax
		total+=tax;
		Console.print("Total after tax: "+Console.roundDouble(total,2)+"$");
		
		// paying
		double payment=Console.readDouble("Enter amount tendered: ");
		double change=payment-total;
		// output
		if (change<0) {
			Console.print("You are "+change*-1+"$ short.\nleave the store cheapskate");
		} else {
			Console.print("Your change is: "+change+"$");
		}
		
	}

}
