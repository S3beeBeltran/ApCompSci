/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int x = 100;
	String z = new String("Yes");
	String g = new String ("yes");
	String h = new String ("Y");
	String m = new String("y");
	System.out.println(" Slot machine rules :");
	System.out.println(" 1. Each player starters with $100");
	System.out.println(" 2. Input a wager less than your total amount of money, it has to be at least a dollar, no change");
	System.out.println(" 3. The slot machine will roll three numbers from 1 to 10.");
	System.out.println("    a. If two numbers match, you double your money.");
	System.out.println("    b. If three numbers match, you triple your money.");
	System.out.println("    c. If none match, you lose your money.");
	System.out.println(" --------------------------------------------------");
	while(true);
	System.out.println(" ");
	System.out.println(" Would you like to play slots? (Yes/yes/Y/y) ");
	String l = sc.nextLine();
	if(l.equals(z)){
		System.out.println("You have $100. How much would you like to wager?");
	}
	if(l.equals(g)){
		System.out.println("You have $100. How much would you like to wager?");
	}
	if(l.equals(h)){
		System.out.println("You have $100. How much would you like to wager?");
	}
	if(l.equals(m)){
		System.out.println("You have $100. How much would you like to wager?");
	}
	int p = sc.nextInt();
	System.out.println(" Lets Gamble!!! ");
	System.out.println(" your rolls are............................");
	int k = (int) (Math.random() * 10);
	int poo = (int) (Math.random() * 10);
	int ca = (int) (Math.random() * 10);
	
	System.out.println( k + " | " + poo + " | " + ca);
	
	if( k = poo || k = ca || poo = ca){
	System.out.print(x + p);
	}
	else if( k != poo || k != ca || poo != ca){
	System.out.print(x - p);
	}
	else if( k = poo && poo = ca){
		System.out.print()
	}
	
	
	}
}
