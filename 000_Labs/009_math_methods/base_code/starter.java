/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st number... ");
	double pp = sc.nextDouble();
	System.out.println("Enter 2nd number... ");
	double pepe = sc.nextDouble();
	System.out.println("Here is the max of both Doubles...");
	System.out.println(Math.max(pp,pepe));
	
	System.out.println("Here is the square root of the second value...");
	System.out.println(Math.sqrt(pepe));
	
	System.out.println("Here is the output of the first value to power of the second value...");
	System.out.print(Math.pow(pp,pepe));
	
	
	
	}
}
